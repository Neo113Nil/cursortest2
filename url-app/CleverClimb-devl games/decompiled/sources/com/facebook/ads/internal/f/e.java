package com.facebook.ads.internal.f;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.facebook.ads.internal.q.a.m;
import com.facebook.ads.internal.q.a.p;
import com.facebook.ads.internal.q.a.r;
import com.tapjoy.TapjoyConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5119a = "com.facebook.ads.internal.f.e";

    /* renamed from: b, reason: collision with root package name */
    private static final Object f5120b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static final Set<String> f5121c = Collections.synchronizedSet(new HashSet());

    /* renamed from: d, reason: collision with root package name */
    private static final Map<String, Integer> f5122d = Collections.synchronizedMap(new HashMap());

    public static d a(Exception exc, Context context, Map<String, String> map) {
        try {
            d dVar = new d(m.b(), m.c(), new b(p.a(exc), map, true).a());
            try {
                a(dVar, context);
                return dVar;
            } catch (Exception unused) {
                return dVar;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    public static JSONArray a(Context context) {
        return a(context, -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00dc A[Catch: all -> 0x00d6, IOException -> 0x00d8, Merged into TryCatch #6 {all -> 0x00d6, IOException -> 0x00ba, IOException -> 0x00d8, IOException -> 0x0090, blocks: (B:53:0x008c, B:41:0x0094, B:43:0x0099, B:49:0x00cc, B:47:0x009d, B:48:0x00a1, B:82:0x00d2, B:73:0x00dc, B:75:0x00e1, B:80:0x00ec, B:79:0x00e5, B:69:0x00b6, B:61:0x00be, B:63:0x00c3, B:67:0x00c7), top: B:5:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e1 A[Catch: all -> 0x00d6, IOException -> 0x00d8, Merged into TryCatch #6 {all -> 0x00d6, IOException -> 0x00ba, IOException -> 0x00d8, IOException -> 0x0090, blocks: (B:53:0x008c, B:41:0x0094, B:43:0x0099, B:49:0x00cc, B:47:0x009d, B:48:0x00a1, B:82:0x00d2, B:73:0x00dc, B:75:0x00e1, B:80:0x00ec, B:79:0x00e5, B:69:0x00b6, B:61:0x00be, B:63:0x00c3, B:67:0x00c7), top: B:5:0x0009 }, TRY_LEAVE] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.io.InputStreamReader, java.io.Reader] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.io.FileInputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONArray a(Context context, int i) {
        BufferedReader bufferedReader;
        ?? r3;
        String str;
        String str2;
        FileInputStream fileInputStream;
        InputStreamReader inputStreamReader;
        JSONArray jSONArray = new JSONArray();
        synchronized (f5120b) {
            BufferedReader bufferedReader2 = null;
            try {
                try {
                    try {
                        if (new File(context.getFilesDir(), "debuglogs").exists()) {
                            context = context.openFileInput("debuglogs");
                            try {
                                r3 = new InputStreamReader(context);
                                try {
                                    bufferedReader = new BufferedReader(r3);
                                    while (true) {
                                        try {
                                            String readLine = bufferedReader.readLine();
                                            if (readLine == null || i == 0) {
                                                break;
                                            }
                                            JSONObject jSONObject = new JSONObject(readLine);
                                            if (!jSONObject.has("attempt")) {
                                                jSONObject.put("attempt", 0);
                                            }
                                            String string = jSONObject.getString("id");
                                            if (!f5121c.contains(string)) {
                                                int i2 = jSONObject.getInt("attempt");
                                                if (f5122d.containsKey(string)) {
                                                    jSONObject.put("attempt", f5122d.get(string));
                                                } else {
                                                    a(string, i2);
                                                }
                                                jSONArray.put(jSONObject);
                                                if (i > 0) {
                                                    i--;
                                                }
                                            }
                                        } catch (IOException | JSONException e) {
                                            e = e;
                                            bufferedReader2 = bufferedReader;
                                            Log.e(f5119a, "Failed to read crashes", e);
                                            if (bufferedReader2 != null) {
                                                bufferedReader2.close();
                                            }
                                            if (r3 != 0) {
                                                r3.close();
                                            }
                                            if (context != 0) {
                                                context.close();
                                            }
                                            return jSONArray;
                                        } catch (Throwable th) {
                                            th = th;
                                            if (bufferedReader != null) {
                                                bufferedReader.close();
                                            }
                                            if (r3 != 0) {
                                                r3.close();
                                            }
                                            if (context != 0) {
                                                context.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    bufferedReader2 = bufferedReader;
                                    inputStreamReader = r3;
                                    fileInputStream = context;
                                } catch (IOException | JSONException e2) {
                                    e = e2;
                                }
                            } catch (IOException | JSONException e3) {
                                e = e3;
                                r3 = 0;
                            } catch (Throwable th2) {
                                th = th2;
                                r3 = 0;
                                context = context;
                                bufferedReader = r3;
                                if (bufferedReader != null) {
                                }
                                if (r3 != 0) {
                                }
                                if (context != 0) {
                                }
                                throw th;
                            }
                        } else {
                            fileInputStream = null;
                            inputStreamReader = null;
                        }
                        if (bufferedReader2 != null) {
                            bufferedReader2.close();
                        }
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                    } catch (IOException e4) {
                        e = e4;
                        str = f5119a;
                        str2 = "Failed to close buffers";
                        Log.e(str, str2, e);
                        return jSONArray;
                    } catch (IOException e5) {
                        Log.e(f5119a, "Failed to close buffers", e5);
                        throw th;
                    } catch (IOException e6) {
                        e = e6;
                        str = f5119a;
                        str2 = "Failed to close buffers";
                        Log.e(str, str2, e);
                        return jSONArray;
                    } finally {
                    }
                } catch (IOException | JSONException e7) {
                    e = e7;
                    context = 0;
                    r3 = 0;
                } catch (Throwable th3) {
                    th = th3;
                    context = 0;
                    r3 = 0;
                }
            } catch (Throwable th4) {
                th = th4;
                bufferedReader = null;
            }
        }
        return jSONArray;
    }

    private static JSONObject a(d dVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", UUID.randomUUID().toString());
        jSONObject.put("type", dVar.a());
        jSONObject.put("time", r.a(dVar.b()));
        jSONObject.put("session_time", r.a(dVar.c()));
        jSONObject.put(TapjoyConstants.TJC_SESSION_ID, dVar.d());
        jSONObject.put("data", dVar.e() != null ? new JSONObject(dVar.e()) : new JSONObject());
        jSONObject.put("attempt", 0);
        return jSONObject;
    }

    public static void a(d dVar, Context context) {
        if (dVar == null || context == null) {
            return;
        }
        synchronized (f5120b) {
            try {
                JSONObject a2 = a(dVar);
                FileOutputStream openFileOutput = context.openFileOutput("debuglogs", 32768);
                openFileOutput.write((a2.toString() + "\n").getBytes());
                openFileOutput.close();
                d(context);
            } catch (Exception e) {
                Log.e(f5119a, "Failed to store crash", e);
            }
        }
    }

    public static void a(String str) {
        Integer num = f5122d.get(str);
        if (num == null) {
            num = 0;
        } else {
            f5122d.remove(str);
        }
        f5122d.put(str, Integer.valueOf(num.intValue() + 1));
    }

    private static void a(String str, int i) {
        if (f5121c.contains(str)) {
            throw new RuntimeException("finished event should not be updated to OngoingEvent.");
        }
        if (f5122d.containsKey(str)) {
            f5122d.remove(str);
        }
        f5122d.put(str, Integer.valueOf(i));
    }

    public static int b(Context context) {
        return context.getApplicationContext().getSharedPreferences("DEBUG_PREF", 0).getInt("EventCount", 0) - f5121c.size();
    }

    private static void b(Context context, int i) {
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences("DEBUG_PREF", 0).edit();
        if (i < 0) {
            i = 0;
        }
        edit.putInt("EventCount", i).apply();
    }

    public static void b(String str) {
        if (f5122d.containsKey(str)) {
            f5122d.remove(str);
        }
        f5121c.add(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fa A[Catch: IOException -> 0x00f6, all -> 0x0124, Merged into TryCatch #3 {all -> 0x0124, IOException -> 0x00b8, IOException -> 0x00f6, IOException -> 0x0126, blocks: (B:56:0x00b4, B:42:0x00bc, B:44:0x00c1, B:46:0x00c6, B:51:0x00d1, B:52:0x00db, B:50:0x00ca, B:75:0x00f2, B:62:0x00fa, B:64:0x00ff, B:66:0x0104, B:71:0x010f, B:72:0x0119, B:70:0x0108, B:95:0x0120, B:83:0x012a, B:85:0x012f, B:87:0x0134, B:92:0x013f, B:93:0x0149, B:91:0x0138), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ff A[Catch: IOException -> 0x00f6, all -> 0x0124, Merged into TryCatch #3 {all -> 0x0124, IOException -> 0x00b8, IOException -> 0x00f6, IOException -> 0x0126, blocks: (B:56:0x00b4, B:42:0x00bc, B:44:0x00c1, B:46:0x00c6, B:51:0x00d1, B:52:0x00db, B:50:0x00ca, B:75:0x00f2, B:62:0x00fa, B:64:0x00ff, B:66:0x0104, B:71:0x010f, B:72:0x0119, B:70:0x0108, B:95:0x0120, B:83:0x012a, B:85:0x012f, B:87:0x0134, B:92:0x013f, B:93:0x0149, B:91:0x0138), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0104 A[Catch: IOException -> 0x00f6, all -> 0x0124, Merged into TryCatch #3 {all -> 0x0124, IOException -> 0x00b8, IOException -> 0x00f6, IOException -> 0x0126, blocks: (B:56:0x00b4, B:42:0x00bc, B:44:0x00c1, B:46:0x00c6, B:51:0x00d1, B:52:0x00db, B:50:0x00ca, B:75:0x00f2, B:62:0x00fa, B:64:0x00ff, B:66:0x0104, B:71:0x010f, B:72:0x0119, B:70:0x0108, B:95:0x0120, B:83:0x012a, B:85:0x012f, B:87:0x0134, B:92:0x013f, B:93:0x0149, B:91:0x0138), top: B:5:0x000a }, TRY_LEAVE] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012a A[Catch: all -> 0x0124, IOException -> 0x0126, Merged into TryCatch #3 {all -> 0x0124, IOException -> 0x00b8, IOException -> 0x00f6, IOException -> 0x0126, blocks: (B:56:0x00b4, B:42:0x00bc, B:44:0x00c1, B:46:0x00c6, B:51:0x00d1, B:52:0x00db, B:50:0x00ca, B:75:0x00f2, B:62:0x00fa, B:64:0x00ff, B:66:0x0104, B:71:0x010f, B:72:0x0119, B:70:0x0108, B:95:0x0120, B:83:0x012a, B:85:0x012f, B:87:0x0134, B:92:0x013f, B:93:0x0149, B:91:0x0138), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012f A[Catch: all -> 0x0124, IOException -> 0x0126, Merged into TryCatch #3 {all -> 0x0124, IOException -> 0x00b8, IOException -> 0x00f6, IOException -> 0x0126, blocks: (B:56:0x00b4, B:42:0x00bc, B:44:0x00c1, B:46:0x00c6, B:51:0x00d1, B:52:0x00db, B:50:0x00ca, B:75:0x00f2, B:62:0x00fa, B:64:0x00ff, B:66:0x0104, B:71:0x010f, B:72:0x0119, B:70:0x0108, B:95:0x0120, B:83:0x012a, B:85:0x012f, B:87:0x0134, B:92:0x013f, B:93:0x0149, B:91:0x0138), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0134 A[Catch: all -> 0x0124, IOException -> 0x0126, Merged into TryCatch #3 {all -> 0x0124, IOException -> 0x00b8, IOException -> 0x00f6, IOException -> 0x0126, blocks: (B:56:0x00b4, B:42:0x00bc, B:44:0x00c1, B:46:0x00c6, B:51:0x00d1, B:52:0x00db, B:50:0x00ca, B:75:0x00f2, B:62:0x00fa, B:64:0x00ff, B:66:0x0104, B:71:0x010f, B:72:0x0119, B:70:0x0108, B:95:0x0120, B:83:0x012a, B:85:0x012f, B:87:0x0134, B:92:0x013f, B:93:0x0149, B:91:0x0138), top: B:5:0x000a }, TRY_LEAVE] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0120 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v0, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.io.InputStreamReader, java.io.Reader] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(Context context) {
        BufferedReader bufferedReader;
        ?? r5;
        FileInputStream fileInputStream;
        ?? jSONArray = new JSONArray();
        synchronized (f5120b) {
            BufferedReader bufferedReader2 = null;
            r3 = null;
            bufferedReader2 = null;
            r3 = null;
            bufferedReader2 = null;
            bufferedReader2 = null;
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    try {
                        if (new File(context.getFilesDir(), "debuglogs").exists()) {
                            fileInputStream = context.openFileInput("debuglogs");
                            try {
                                r5 = new InputStreamReader(fileInputStream);
                                try {
                                    bufferedReader = new BufferedReader(r5);
                                    while (true) {
                                        try {
                                            String readLine = bufferedReader.readLine();
                                            if (readLine == null) {
                                                break;
                                            }
                                            JSONObject jSONObject = new JSONObject(readLine);
                                            String string = jSONObject.getString("id");
                                            if (!f5121c.contains(string)) {
                                                if (f5122d.containsKey(string)) {
                                                    jSONObject.put("attempt", f5122d.get(string));
                                                }
                                                jSONArray.put(jSONObject);
                                            }
                                        } catch (IOException | JSONException e) {
                                            e = e;
                                            jSONArray = 0;
                                        } catch (Throwable th) {
                                            th = th;
                                            if (bufferedReader != null) {
                                            }
                                            if (r5 != 0) {
                                            }
                                            if (fileInputStream != null) {
                                            }
                                            if (fileOutputStream != null) {
                                            }
                                            f5121c.clear();
                                            f5122d.clear();
                                            throw th;
                                        }
                                    }
                                    StringBuilder sb = new StringBuilder();
                                    int length = jSONArray.length();
                                    for (int i = 0; i < length; i++) {
                                        sb.append(jSONArray.getJSONObject(i).toString());
                                        sb.append('\n');
                                    }
                                    jSONArray = context.openFileOutput("debuglogs", 0);
                                    try {
                                        jSONArray.write(sb.toString().getBytes());
                                        bufferedReader2 = bufferedReader;
                                        jSONArray = jSONArray;
                                        r5 = r5;
                                    } catch (IOException | JSONException e2) {
                                        e = e2;
                                        bufferedReader2 = bufferedReader;
                                        Log.e(f5119a, "Failed to rewrite File.", e);
                                        if (bufferedReader2 != null) {
                                        }
                                        if (r5 != 0) {
                                        }
                                        if (fileInputStream != null) {
                                        }
                                        if (jSONArray != 0) {
                                        }
                                        f5121c.clear();
                                        f5122d.clear();
                                        return false;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        fileOutputStream = jSONArray;
                                        if (bufferedReader != null) {
                                        }
                                        if (r5 != 0) {
                                        }
                                        if (fileInputStream != null) {
                                        }
                                        if (fileOutputStream != null) {
                                        }
                                        f5121c.clear();
                                        f5122d.clear();
                                        throw th;
                                    }
                                } catch (IOException | JSONException e3) {
                                    e = e3;
                                    jSONArray = 0;
                                } catch (Throwable th3) {
                                    th = th3;
                                    bufferedReader = null;
                                }
                            } catch (IOException | JSONException e4) {
                                e = e4;
                                jSONArray = 0;
                                r5 = 0;
                            } catch (Throwable th4) {
                                th = th4;
                                r5 = 0;
                                bufferedReader = r5;
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                if (r5 != 0) {
                                    r5.close();
                                }
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                f5121c.clear();
                                f5122d.clear();
                                throw th;
                            }
                        } else {
                            jSONArray = 0;
                            fileInputStream = null;
                            r5 = 0;
                        }
                    } catch (IOException e5) {
                        Log.e(f5119a, "Failed to close buffers", e5);
                    } catch (IOException e6) {
                        Log.e(f5119a, "Failed to close buffers", e6);
                        f5121c.clear();
                        f5122d.clear();
                        return false;
                    } catch (IOException e7) {
                        Log.e(f5119a, "Failed to close buffers", e7);
                        f5121c.clear();
                        f5122d.clear();
                        throw th;
                    } finally {
                    }
                    try {
                        b(context, b(context));
                        if (bufferedReader2 != null) {
                            bufferedReader2.close();
                        }
                        if (r5 != 0) {
                            r5.close();
                        }
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        if (jSONArray != 0) {
                            jSONArray.close();
                        }
                        f5121c.clear();
                        f5122d.clear();
                        return true;
                    } catch (IOException | JSONException e8) {
                        e = e8;
                        Log.e(f5119a, "Failed to rewrite File.", e);
                        if (bufferedReader2 != null) {
                            bufferedReader2.close();
                        }
                        if (r5 != 0) {
                            r5.close();
                        }
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        if (jSONArray != 0) {
                            jSONArray.close();
                        }
                        f5121c.clear();
                        f5122d.clear();
                        return false;
                    }
                } catch (IOException | JSONException e9) {
                    e = e9;
                    jSONArray = 0;
                    fileInputStream = null;
                    r5 = 0;
                } catch (Throwable th5) {
                    th = th5;
                    fileInputStream = null;
                    r5 = 0;
                }
            } catch (Throwable th6) {
                th = th6;
                bufferedReader = null;
            }
        }
    }

    public static boolean c(String str) {
        return f5121c.contains(str) || f5122d.containsKey(str);
    }

    private static void d(Context context) {
        b(context, context.getApplicationContext().getSharedPreferences("DEBUG_PREF", 0).getInt("EventCount", 0) + 1);
    }
}
