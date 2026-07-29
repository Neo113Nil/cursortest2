package com.tapjoy.internal;

import android.util.Log;
import java.util.HashMap;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class x {
    public static void a(String str, String str2, Object... objArr) {
        a(6, str, str2, objArr);
    }

    public static void a(int i, String str, @Nullable String str2, @Nullable Throwable th) {
        if (str2 != null) {
            Log.println(i, str, str2);
        }
        if (th != null) {
            Log.println(i, str, Log.getStackTraceString(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(int i, String str, String str2, Object... objArr) {
        Throwable th;
        jg jgVar;
        int i2;
        if (objArr != null && objArr.length != 0) {
            Object obj = objArr[objArr.length - 1];
            if (obj instanceof Throwable) {
                th = (Throwable) obj;
                if (str2 != null) {
                    jgVar = new jg(null, objArr, th);
                } else if (objArr == null) {
                    jgVar = new jg(str2);
                } else {
                    StringBuffer stringBuffer = new StringBuffer(str2.length() + 50);
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        if (i3 < objArr.length) {
                            int indexOf = str2.indexOf("{}", i4);
                            if (indexOf != -1) {
                                if (!(indexOf != 0 && str2.charAt(indexOf + (-1)) == '\\')) {
                                    stringBuffer.append(str2.substring(i4, indexOf));
                                    jh.a(stringBuffer, objArr[i3], new HashMap());
                                    i2 = indexOf + 2;
                                } else {
                                    if (!(indexOf >= 2 && str2.charAt(indexOf + (-2)) == '\\')) {
                                        i3--;
                                        stringBuffer.append(str2.substring(i4, indexOf - 1));
                                        stringBuffer.append('{');
                                        i2 = indexOf + 1;
                                    } else {
                                        stringBuffer.append(str2.substring(i4, indexOf - 1));
                                        jh.a(stringBuffer, objArr[i3], new HashMap());
                                        i2 = indexOf + 2;
                                    }
                                }
                                i4 = i2;
                                i3++;
                            } else if (i4 == 0) {
                                jgVar = new jg(str2, objArr, th);
                            } else {
                                stringBuffer.append(str2.substring(i4, str2.length()));
                                jgVar = new jg(stringBuffer.toString(), objArr, th);
                            }
                        } else {
                            stringBuffer.append(str2.substring(i4, str2.length()));
                            if (i3 < objArr.length - 1) {
                                jgVar = new jg(stringBuffer.toString(), objArr, th);
                            } else {
                                jgVar = new jg(stringBuffer.toString(), objArr, null);
                            }
                        }
                    }
                }
                a(i, str, jgVar.f8443b, jgVar.f8444c);
            }
        }
        th = null;
        if (str2 != null) {
        }
        a(i, str, jgVar.f8443b, jgVar.f8444c);
    }
}
