package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class to0 {
    public static final to0 b = new to0();
    public static final to0 c = new to0();
    public static final to0 d = new to0();
    public final eo1 a = new eo1(new uo0[16]);

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0049, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Function1 function1) {
        if (this == b) {
            lh.g("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return false;
        }
        if (this == c) {
            lh.g("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return false;
        }
        eo1 eo1Var = this.a;
        int i = eo1Var.o;
        if (i == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return false;
        }
        Object[] objArr = eo1Var.m;
        boolean z = false;
        for (int i2 = 0; i2 < i; i2++) {
            o90 o90Var = (uo0) objArr[i2];
            if (!((ul1) o90Var).m.z) {
                h21.b("visitChildren called on an unattached node");
            }
            eo1 eo1Var2 = new eo1(new ul1[16]);
            ul1 ul1Var = ((ul1) o90Var).m;
            ul1 ul1Var2 = ul1Var.r;
            if (ul1Var2 == null) {
                s03.b(eo1Var2, ul1Var);
            } else {
                eo1Var2.b(ul1Var2);
            }
            while (true) {
                int i3 = eo1Var2.o;
                if (i3 != 0) {
                    ul1 ul1Var3 = (ul1) eo1Var2.l(i3 - 1);
                    if ((ul1Var3.p & 1024) == 0) {
                        s03.b(eo1Var2, ul1Var3);
                    } else {
                        while (true) {
                            if (ul1Var3 == null) {
                                break;
                            }
                            if ((ul1Var3.o & 1024) != 0) {
                                eo1 eo1Var3 = null;
                                while (ul1Var3 != null) {
                                    if (ul1Var3 instanceof yo0) {
                                        yo0 yo0Var = (yo0) ul1Var3;
                                        if (yo0Var.H0().a ? ((Boolean) function1.invoke(yo0Var)).booleanValue() : mh2.h(yo0Var, 7, function1)) {
                                            z = true;
                                            break;
                                        }
                                    } else if ((ul1Var3.o & 1024) != 0 && (ul1Var3 instanceof p90)) {
                                        int i4 = 0;
                                        for (ul1 ul1Var4 = ((p90) ul1Var3).B; ul1Var4 != null; ul1Var4 = ul1Var4.r) {
                                            if ((ul1Var4.o & 1024) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    ul1Var3 = ul1Var4;
                                                } else {
                                                    if (eo1Var3 == null) {
                                                        eo1Var3 = new eo1(new ul1[16]);
                                                    }
                                                    if (ul1Var3 != null) {
                                                        eo1Var3.b(ul1Var3);
                                                        ul1Var3 = null;
                                                    }
                                                    eo1Var3.b(ul1Var4);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    ul1Var3 = s03.c(eo1Var3);
                                }
                            } else {
                                ul1Var3 = ul1Var3.r;
                            }
                        }
                    }
                }
            }
        }
        return z;
    }
}
