package com.facebook.appevents.ml;

import android.text.TextUtils;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import defpackage.yt;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class Utils {
    private static final String DIR_NAME = "facebook_ml/";
    public static final Utils INSTANCE = new Utils();

    private Utils() {
    }

    public static final File getMlDir() {
        if (CrashShieldHandler.isObjectCrashing(Utils.class)) {
            return null;
        }
        try {
            File file = new File(FacebookSdk.getApplicationContext().getFilesDir(), DIR_NAME);
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return null;
                }
            }
            return file;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Utils.class);
            return null;
        }
    }

    public static final Map<String, MTensor> parseModelWeights(File file) {
        Map<String, MTensor> map;
        if (!CrashShieldHandler.isObjectCrashing(Utils.class)) {
            try {
                file.getClass();
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    int available = fileInputStream.available();
                    DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                    byte[] bArr = new byte[available];
                    dataInputStream.readFully(bArr);
                    dataInputStream.close();
                    if (available >= 4) {
                        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, 4);
                        wrap.order(ByteOrder.LITTLE_ENDIAN);
                        int i = wrap.getInt();
                        int i2 = i + 4;
                        if (available >= i2) {
                            JSONObject jSONObject = new JSONObject(new String(bArr, 4, i, yt.b));
                            JSONArray names = jSONObject.names();
                            int length = names.length();
                            String[] strArr = new String[length];
                            for (int i3 = 0; i3 < length; i3++) {
                                strArr[i3] = names.getString(i3);
                            }
                            int i4 = 1;
                            if (length > 1) {
                                Arrays.sort(strArr);
                            }
                            HashMap hashMap = new HashMap();
                            int i5 = 0;
                            while (i5 < length) {
                                String str = strArr[i5];
                                if (str != null) {
                                    JSONArray jSONArray = jSONObject.getJSONArray(str);
                                    int length2 = jSONArray.length();
                                    int[] iArr = new int[length2];
                                    map = null;
                                    for (int i6 = 0; i6 < length2; i6++) {
                                        try {
                                            int i7 = jSONArray.getInt(i6);
                                            iArr[i6] = i7;
                                            i4 *= i7;
                                        } catch (Exception unused) {
                                            return null;
                                        } catch (Throwable th) {
                                            th = th;
                                            CrashShieldHandler.handleThrowable(th, Utils.class);
                                            return map;
                                        }
                                    }
                                    int i8 = i4 * 4;
                                    int i9 = i2 + i8;
                                    if (i9 > available) {
                                        return null;
                                    }
                                    ByteBuffer wrap2 = ByteBuffer.wrap(bArr, i2, i8);
                                    wrap2.order(ByteOrder.LITTLE_ENDIAN);
                                    MTensor mTensor = new MTensor(iArr);
                                    wrap2.asFloatBuffer().get(mTensor.getData(), 0, i4);
                                    hashMap.put(str, mTensor);
                                    i2 = i9;
                                }
                                i5++;
                                i4 = 1;
                            }
                            return hashMap;
                        }
                    }
                } catch (Exception unused2) {
                }
            } catch (Throwable th2) {
                th = th2;
                map = null;
            }
        }
        return null;
    }

    public final String normalizeString(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            str.getClass();
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.c(str.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            String join = TextUtils.join(" ", (String[]) new Regex("\\s+").b(str.subSequence(i, length + 1).toString()).toArray(new String[0]));
            join.getClass();
            return join;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final int[] vectorize(String str, int i) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            str.getClass();
            int[] iArr = new int[i];
            String normalizeString = normalizeString(str);
            Charset forName = Charset.forName("UTF-8");
            forName.getClass();
            byte[] bytes = normalizeString.getBytes(forName);
            bytes.getClass();
            for (int i2 = 0; i2 < i; i2++) {
                if (i2 < bytes.length) {
                    iArr[i2] = bytes[i2] & 255;
                } else {
                    iArr[i2] = 0;
                }
            }
            return iArr;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }
}
