package com.bytedance.sdk.component.pglcrypt;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import androidx.core.view.PointerIconCompat;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class PglCryptUtils {
    public static final int BASE64_FAILED = 504;
    public static final int COMPRESS_FAILED = 503;
    public static final int CRYPT_OK = 0;
    public static final int CYPHER_VERSION = 4;
    public static final int DECRYPT_FAILED = 506;
    public static final int ENCRYPT_FAILED = 505;
    public static final int INPUT_INVALID = 502;
    public static final String KEY_CYPHER = "cypher";
    public static final String KEY_MESSAGE = "message";
    public static final int LOAD_SO_FAILED = 501;
    private static volatile boolean icD = true;
    private static volatile PglCryptUtils pvs;

    public static native byte[] bc(int i, byte[] bArr);

    private PglCryptUtils() {
    }

    public static PglCryptUtils getInstance() {
        if (pvs == null) {
            synchronized (PglCryptUtils.class) {
                if (pvs == null) {
                    try {
                        System.loadLibrary("pglarmor");
                    } catch (Throwable unused) {
                        icD = false;
                    }
                    pvs = new PglCryptUtils();
                }
            }
        }
        return pvs;
    }

    public Pair<Integer, JSONObject> cypher4Encrypt(JSONObject jSONObject) throws JSONException {
        byte[] bArr;
        if (!icD) {
            return new Pair<>(501, null);
        }
        if (jSONObject == null) {
            return new Pair<>(502, null);
        }
        byte[] pvs2 = pvs(jSONObject.toString());
        if (pvs2 == null || pvs2.length == 0) {
            return new Pair<>(503, null);
        }
        try {
            bArr = bc(PointerIconCompat.TYPE_ALIAS, pvs2);
        } catch (Throwable th) {
            Log.e("ARMOR", th.toString());
            bArr = null;
        }
        if (bArr == null || bArr.length == 0) {
            return new Pair<>(505, null);
        }
        String encodeToString = Base64.encodeToString(bArr, 0);
        JSONObject jSONObject2 = new JSONObject();
        if (TextUtils.isEmpty(encodeToString)) {
            return new Pair<>(504, null);
        }
        jSONObject2.put(KEY_MESSAGE, encodeToString);
        jSONObject2.put("cypher", 4);
        return new Pair<>(0, jSONObject2);
    }

    public Pair<Integer, byte[]> cypher4Encrypt(byte[] bArr) {
        byte[] bArr2;
        if (!icD) {
            return new Pair<>(501, null);
        }
        if (bArr == null || bArr.length == 0) {
            return new Pair<>(502, null);
        }
        try {
            bArr2 = bc(PointerIconCompat.TYPE_ALIAS, bArr);
        } catch (Throwable th) {
            Log.e("ARMOR", th.toString());
            bArr2 = null;
        }
        if (bArr2 == null || bArr2.length == 0) {
            return new Pair<>(505, null);
        }
        return new Pair<>(0, bArr2);
    }

    public Pair<Integer, String> cypher4Decrypt(String str) {
        byte[] bArr;
        if (!icD) {
            return new Pair<>(501, null);
        }
        if (str == null || str.length() == 0) {
            return new Pair<>(502, null);
        }
        byte[] decode = Base64.decode(str, 0);
        if (decode == null || decode.length == 0) {
            return new Pair<>(504, null);
        }
        try {
            bArr = bc(PointerIconCompat.TYPE_COPY, decode);
        } catch (Throwable th) {
            Log.e("ARMOR", th.toString());
            bArr = null;
        }
        if (bArr == null || bArr.length == 0) {
            return new Pair<>(506, null);
        }
        String pvs2 = pvs(bArr);
        if (TextUtils.isEmpty(pvs2)) {
            return new Pair<>(503, null);
        }
        return new Pair<>(0, pvs2);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0065 A[Catch: Exception -> 0x0061, TRY_LEAVE, TryCatch #7 {Exception -> 0x0061, blocks: (B:36:0x005d, B:29:0x0065), top: B:35:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static byte[] pvs(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        GZIPOutputStream gZIPOutputStream2 = null;
        if (str != null) {
            try {
                if (str.length() != 0) {
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                            try {
                                try {
                                    gZIPOutputStream.write(str.getBytes("utf-8"));
                                    gZIPOutputStream.close();
                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    return byteArray;
                                } catch (Exception e) {
                                    e = e;
                                    Log.e("ARMOR", e.toString());
                                    if (gZIPOutputStream != null) {
                                        gZIPOutputStream.close();
                                    }
                                    if (byteArrayOutputStream == null) {
                                        return null;
                                    }
                                    byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    return byteArray2;
                                }
                            } catch (Throwable th) {
                                th = th;
                                gZIPOutputStream2 = gZIPOutputStream;
                                if (gZIPOutputStream2 != null) {
                                    try {
                                        gZIPOutputStream2.close();
                                    } catch (Exception e2) {
                                        Log.e("ARMOR", e2.toString());
                                        throw th;
                                    }
                                }
                                if (byteArrayOutputStream != null) {
                                    byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                }
                                throw th;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            gZIPOutputStream = null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (gZIPOutputStream2 != null) {
                            }
                            if (byteArrayOutputStream != null) {
                            }
                            throw th;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        byteArrayOutputStream = null;
                        gZIPOutputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        byteArrayOutputStream = null;
                    }
                }
            } catch (Exception e5) {
                Log.e("ARMOR", e5.toString());
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.zip.GZIPInputStream] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.zip.GZIPInputStream] */
    /* JADX WARN: Type inference failed for: r8v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r8v9 */
    private static String pvs(byte[] bArr) {
        ?? r3;
        Throwable th;
        ?? r8;
        Exception exc;
        String str;
        String str2 = null;
        str2 = null;
        r1 = null;
        GZIPInputStream gZIPInputStream = null;
        if (bArr != 0) {
            try {
                if (bArr.length != 0) {
                    try {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                        bArr = new ByteArrayOutputStream();
                        try {
                            r3 = new GZIPInputStream(byteArrayInputStream);
                        } catch (Exception e) {
                            exc = e;
                            str = null;
                            r8 = bArr;
                        }
                        try {
                            byte[] bArr2 = new byte[1024];
                            while (true) {
                                int read = r3.read(bArr2);
                                if (read == -1) {
                                    break;
                                }
                                bArr.write(bArr2, 0, read);
                            }
                            str2 = bArr.toString("utf-8");
                            byteArrayInputStream.close();
                            try {
                                r3.close();
                                bArr.close();
                                bArr = bArr;
                            } catch (Exception e2) {
                                String exc2 = e2.toString();
                                Log.e("ARMOR", exc2);
                                bArr = exc2;
                            }
                        } catch (Exception e3) {
                            str = str2;
                            gZIPInputStream = r3;
                            exc = e3;
                            r8 = bArr;
                            Log.e("ARMOR", exc.toString());
                            if (gZIPInputStream != null) {
                                try {
                                    gZIPInputStream.close();
                                } catch (Exception e4) {
                                    r8 = e4.toString();
                                    Log.e("ARMOR", r8);
                                    str2 = str;
                                    bArr = r8;
                                    return str2;
                                }
                            }
                            if (r8 != 0) {
                                r8.close();
                            }
                            str2 = str;
                            bArr = r8;
                            return str2;
                        } catch (Throwable th2) {
                            th = th2;
                            if (r3 != null) {
                                try {
                                    r3.close();
                                } catch (Exception e5) {
                                    Log.e("ARMOR", e5.toString());
                                    throw th;
                                }
                            }
                            if (bArr != 0) {
                                bArr.close();
                            }
                            throw th;
                        }
                    } catch (Exception e6) {
                        r8 = 0;
                        exc = e6;
                        str = null;
                    } catch (Throwable th3) {
                        r3 = null;
                        th = th3;
                        bArr = 0;
                    }
                    return str2;
                }
            } catch (Throwable th4) {
                r3 = str2;
                th = th4;
            }
        }
        return null;
    }
}
