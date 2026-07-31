package com.bytedance.sdk.component.pglcrypt;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import com.ironsource.B5;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
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
    public static final int UNKNOWN_ERR = 507;
    private static volatile boolean fs = true;
    private static volatile PglCryptUtils zmn;

    public static native byte[] bc(int i, byte[] bArr);

    private PglCryptUtils() {
    }

    public static PglCryptUtils getInstance() {
        if (zmn == null) {
            synchronized (PglCryptUtils.class) {
                try {
                    if (zmn == null) {
                        try {
                            System.loadLibrary("pglarmor");
                        } catch (Throwable unused) {
                            fs = false;
                        }
                        zmn = new PglCryptUtils();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zmn;
    }

    public Pair<Integer, JSONObject> cypher4Encrypt(JSONObject jSONObject) throws JSONException {
        Pair<Integer, String> cypher4EncryptWithNoWrapBase64 = cypher4EncryptWithNoWrapBase64(jSONObject.toString());
        if (cypher4EncryptWithNoWrapBase64 == null) {
            return new Pair<>(507, null);
        }
        if (((Integer) cypher4EncryptWithNoWrapBase64.first).intValue() == 0) {
            JSONObject jSONObject2 = new JSONObject();
            String str = (String) cypher4EncryptWithNoWrapBase64.second;
            if (TextUtils.isEmpty(str)) {
                return new Pair<>(504, null);
            }
            jSONObject2.put("message", str);
            jSONObject2.put("cypher", 4);
            return new Pair<>(0, jSONObject2);
        }
        return new Pair<>(cypher4EncryptWithNoWrapBase64.first, null);
    }

    public Pair<Integer, String> cypher4EncryptWithNoWrapBase64(String str) {
        if (!fs) {
            return new Pair<>(501, null);
        }
        if (TextUtils.isEmpty(str)) {
            return new Pair<>(502, null);
        }
        byte[] zmn2 = zmn(str);
        if (zmn2 == null || zmn2.length == 0) {
            return new Pair<>(503, null);
        }
        Pair<Integer, byte[]> cypher4Encrypt = cypher4Encrypt(zmn2);
        if (cypher4Encrypt == null) {
            return new Pair<>(507, null);
        }
        if (((Integer) cypher4Encrypt.first).intValue() == 0) {
            String encodeToString = Base64.encodeToString((byte[]) cypher4Encrypt.second, 2);
            if (TextUtils.isEmpty(encodeToString)) {
                return new Pair<>(504, null);
            }
            return new Pair<>(0, encodeToString);
        }
        return new Pair<>(cypher4Encrypt.first, null);
    }

    public Pair<Integer, byte[]> cypher4Encrypt(byte[] bArr) {
        byte[] bArr2;
        if (!fs) {
            return new Pair<>(501, null);
        }
        if (bArr == null || bArr.length == 0) {
            return new Pair<>(502, null);
        }
        try {
            bArr2 = bc(1010, bArr);
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
        if (!fs) {
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
            bArr = bc(1011, decode);
        } catch (Throwable th) {
            Log.e("ARMOR", th.toString());
            bArr = null;
        }
        if (bArr == null || bArr.length == 0) {
            return new Pair<>(506, null);
        }
        String zmn2 = zmn(bArr);
        if (TextUtils.isEmpty(zmn2)) {
            return new Pair<>(503, null);
        }
        return new Pair<>(0, zmn2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    private static byte[] zmn(String str) {
        GZIPOutputStream gZIPOutputStream;
        byte[] bArr = null;
        r1 = null;
        bArr = null;
        GZIPOutputStream gZIPOutputStream2 = null;
        if (str != null) {
            ?? length = str.length();
            try {
                try {
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream2 = gZIPOutputStream;
                }
            } catch (Exception e) {
                Log.e("ARMOR", e.toString());
            }
            if (length != 0) {
                try {
                    length = new ByteArrayOutputStream();
                    try {
                        gZIPOutputStream = new GZIPOutputStream(length);
                        try {
                            gZIPOutputStream.write(str.getBytes(B5.O));
                            gZIPOutputStream.close();
                            bArr = length.toByteArray();
                            length.close();
                        } catch (Exception e2) {
                            e = e2;
                            Log.e("ARMOR", e.toString());
                            if (gZIPOutputStream != null) {
                                gZIPOutputStream.close();
                            }
                            if (length != 0) {
                                bArr = length.toByteArray();
                                length.close();
                            }
                            return bArr;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        gZIPOutputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (gZIPOutputStream2 != null) {
                            try {
                                gZIPOutputStream2.close();
                            } catch (Exception e4) {
                                Log.e("ARMOR", e4.toString());
                                throw th;
                            }
                        }
                        if (length != 0) {
                            length.toByteArray();
                            length.close();
                        }
                        throw th;
                    }
                } catch (Exception e5) {
                    e = e5;
                    length = 0;
                    gZIPOutputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    length = 0;
                }
                return bArr;
            }
        }
        return null;
    }

    private static String zmn(byte[] bArr) {
        GZIPInputStream gZIPInputStream;
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream;
        Exception exc;
        String str;
        ByteArrayInputStream byteArrayInputStream;
        GZIPInputStream gZIPInputStream2 = null;
        String str2 = null;
        gZIPInputStream2 = null;
        gZIPInputStream2 = null;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                try {
                    gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                } catch (Exception e) {
                    exc = e;
                    str = null;
                }
            } catch (Throwable th2) {
                gZIPInputStream = gZIPInputStream2;
                th = th2;
            }
        } catch (Exception e2) {
            byteArrayOutputStream = null;
            exc = e2;
            str = null;
        } catch (Throwable th3) {
            gZIPInputStream = null;
            th = th3;
            byteArrayOutputStream = null;
        }
        try {
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    str2 = byteArrayOutputStream.toString(B5.O);
                    byteArrayInputStream.close();
                    try {
                        gZIPInputStream.close();
                        byteArrayOutputStream.close();
                        return str2;
                    } catch (Exception e3) {
                        Log.e("ARMOR", e3.toString());
                        return str2;
                    }
                }
            }
        } catch (Exception e4) {
            str = str2;
            gZIPInputStream2 = gZIPInputStream;
            exc = e4;
            Log.e("ARMOR", exc.toString());
            if (gZIPInputStream2 != null) {
                try {
                    gZIPInputStream2.close();
                } catch (Exception e5) {
                    Log.e("ARMOR", e5.toString());
                    return str;
                }
            }
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            return str;
        } catch (Throwable th4) {
            th = th4;
            if (gZIPInputStream != null) {
                try {
                    gZIPInputStream.close();
                } catch (Exception e6) {
                    Log.e("ARMOR", e6.toString());
                    throw th;
                }
            }
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            throw th;
        }
    }
}
