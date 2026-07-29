package com.d.a;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Utils.java */
/* loaded from: classes.dex */
final class g {
    static boolean a(long j, long j2, long j3) {
        return TimeUnit.NANOSECONDS.toMillis(j2 - j) >= j3;
    }

    static int a(long j, long j2) {
        if (j2 < 1 || j < 1) {
            return 0;
        }
        if (j >= j2) {
            return 100;
        }
        double d2 = j;
        double d3 = j2;
        Double.isNaN(d2);
        Double.isNaN(d3);
        return (int) ((d2 / d3) * 100.0d);
    }

    static String a(List<com.d.a.d.a> list, boolean z) {
        if (list == null) {
            return "{}";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (com.d.a.d.a aVar : list) {
                jSONObject.put(aVar.a(), aVar.b());
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            if (z) {
                e.printStackTrace();
            }
            return "{}";
        }
    }

    static List<com.d.a.d.a> a(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                arrayList.add(new com.d.a.d.a(next, jSONObject.getString(next)));
            }
        } catch (JSONException e) {
            if (z) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }

    static boolean a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1;
    }

    static boolean b(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    static boolean a(String str) throws IOException, NullPointerException {
        File file = new File(str);
        if (file.exists()) {
            return true;
        }
        return file.createNewFile();
    }

    static boolean b(String str) throws NullPointerException {
        File file = new File(str);
        if (file.exists()) {
            return true;
        }
        return file.mkdirs();
    }

    static boolean c(String str) {
        return new File(str).delete();
    }

    static long d(String str) {
        return new File(str).length();
    }

    static boolean e(String str) {
        return new File(str).exists();
    }

    static File f(String str) {
        return new File(str);
    }

    static void g(String str) throws IOException, NullPointerException {
        File f = f(str);
        boolean b2 = b(f.getParentFile().getAbsolutePath());
        boolean a2 = a(f.getAbsolutePath());
        if (b2 && a2) {
            return;
        }
        throw new IOException("File could not be created for the filePath:" + str);
    }

    static void a(c cVar) {
        if (cVar == null) {
            throw new NullPointerException("Fetch cannot be null");
        }
        if (cVar.d()) {
            throw new com.d.a.b.c("Fetch instance: " + cVar.toString() + " cannot be reused after calling its release() method.Call Fetch.getInstance() for a new instance of Fetch.", -115);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x003c, code lost:
    
        if (r4 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003e, code lost:
    
        r3.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static com.d.a.d.c a(Cursor cursor, boolean z, boolean z2) {
        try {
            if (cursor != null) {
                try {
                    if (!cursor.isClosed() && cursor.getCount() >= 1) {
                        cursor.moveToFirst();
                        com.d.a.d.c a2 = a(cursor, z2);
                        if (cursor != null && z) {
                            cursor.close();
                        }
                        return a2;
                    }
                } catch (Exception e) {
                    if (z2) {
                        e.printStackTrace();
                    }
                    if (cursor == null || !z) {
                        return null;
                    }
                    cursor.close();
                    return null;
                }
            }
            return null;
        } catch (Throwable th) {
            if (cursor != null && z) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002b, code lost:
    
        if (r4 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0041, code lost:
    
        if (r4 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0049, code lost:
    
        if (r4 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x004b, code lost:
    
        r3.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static List<com.d.a.d.c> b(Cursor cursor, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        if (cursor != null) {
            try {
                try {
                } catch (Exception e) {
                    if (z2) {
                        e.printStackTrace();
                    }
                    if (cursor != null) {
                    }
                }
                if (!cursor.isClosed() && cursor.getCount() >= 1) {
                    cursor.moveToFirst();
                    while (!cursor.isAfterLast()) {
                        arrayList.add(a(cursor, z2));
                        cursor.moveToNext();
                    }
                    if (cursor != null) {
                    }
                    return arrayList;
                }
            } catch (Throwable th) {
                if (cursor != null && z) {
                    cursor.close();
                }
                throw th;
            }
        }
        return arrayList;
    }

    static com.d.a.d.c a(Cursor cursor, boolean z) {
        if (cursor == null || cursor.isClosed() || cursor.getCount() < 1) {
            return null;
        }
        long j = cursor.getLong(0);
        int i = cursor.getInt(3);
        String string = cursor.getString(1);
        String string2 = cursor.getString(2);
        int i2 = cursor.getInt(7);
        long j2 = cursor.getLong(6);
        int i3 = cursor.getInt(8);
        long j3 = cursor.getLong(5);
        return new com.d.a.d.c(j, i, string, string2, a(j3, j2), j3, j2, i2, a(cursor.getString(4), z), i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b6, code lost:
    
        if (r17 != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b8, code lost:
    
        r16.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009e, code lost:
    
        if (r17 != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static ArrayList<Bundle> c(Cursor cursor, boolean z, boolean z2) {
        Cursor cursor2 = cursor;
        boolean z3 = z2;
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            if (cursor2 != null) {
                try {
                } catch (Exception e) {
                    e = e;
                }
                if (!cursor.isClosed()) {
                    cursor.moveToFirst();
                    while (!cursor.isAfterLast()) {
                        try {
                            long j = cursor2.getLong(0);
                            int i = cursor2.getInt(3);
                            String string = cursor2.getString(1);
                            String string2 = cursor2.getString(2);
                            int i2 = cursor2.getInt(7);
                            long j2 = cursor2.getLong(6);
                            int i3 = cursor2.getInt(8);
                            long j3 = cursor2.getLong(5);
                            ArrayList<Bundle> b2 = b(cursor2.getString(4), z3);
                            int a2 = a(j3, j2);
                            Bundle bundle = new Bundle();
                            bundle.putLong("com.tonyodev.fetch.extra_id", j);
                            bundle.putInt("com.tonyodev.fetch.extra_status", i);
                            bundle.putString("com.tonyodev.fetch.extra_url", string);
                            bundle.putString("com.tonyodev.fetch.extra_file_path", string2);
                            bundle.putInt("com.tonyodev.fetch.extra_error", i2);
                            bundle.putLong("com.tonyodev.fetch.extra_downloaded_bytes", j3);
                            bundle.putLong("com.tonyodev.fetch.extra_file_size", j2);
                            bundle.putInt("com.tonyodev.fetch.extra_progress", a2);
                            bundle.putInt("com.tonyodev.fetch.extra_priority", i3);
                            bundle.putParcelableArrayList("com.tonyodev.fetch.extra_headers", b2);
                            arrayList.add(bundle);
                            cursor.moveToNext();
                            cursor2 = cursor;
                            z3 = z2;
                        } catch (Exception e2) {
                            e = e2;
                            cursor2 = cursor;
                            if (z2) {
                                e.printStackTrace();
                            }
                            if (cursor2 != null) {
                            }
                            return arrayList;
                        } catch (Throwable th) {
                            th = th;
                            cursor2 = cursor;
                            if (cursor2 != null && z) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    if (cursor2 != null) {
                    }
                    return arrayList;
                }
            }
            if (cursor2 != null && z) {
                cursor.close();
            }
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    static long a() {
        return System.nanoTime();
    }

    static void a(LocalBroadcastManager localBroadcastManager, long j, int i, int i2, long j2, long j3, int i3) {
        if (localBroadcastManager == null) {
            return;
        }
        Intent intent = new Intent("com.tonyodev.fetch.event_action_update");
        intent.putExtra("com.tonyodev.fetch.extra_id", j);
        intent.putExtra("com.tonyodev.fetch.extra_status", i);
        intent.putExtra("com.tonyodev.fetch.extra_progress", i2);
        intent.putExtra("com.tonyodev.fetch.extra_downloaded_bytes", j2);
        intent.putExtra("com.tonyodev.fetch.extra_file_size", j3);
        intent.putExtra("com.tonyodev.fetch.extra_error", i3);
        localBroadcastManager.sendBroadcast(intent);
    }

    static ArrayList<Bundle> b(String str, boolean z) {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        if (str == null) {
            return arrayList;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Bundle bundle = new Bundle();
                bundle.putString("com.tonyodev.fetch.extra_header_name", next);
                bundle.putString("com.tonyodev.fetch.extra_header_value", jSONObject.getString(next));
                arrayList.add(bundle);
            }
        } catch (JSONException e) {
            if (z) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }

    static String b(List<Bundle> list, boolean z) {
        if (list == null) {
            return "{}";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (Bundle bundle : list) {
                String string = bundle.getString("com.tonyodev.fetch.extra_header_name");
                String string2 = bundle.getString("com.tonyodev.fetch.extra_header_value");
                if (string2 == null) {
                    string2 = "";
                }
                if (string != null) {
                    jSONObject.put(string, string2);
                }
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            if (z) {
                e.printStackTrace();
            }
            return "{}";
        }
    }
}
