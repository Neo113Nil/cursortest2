package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import com.facebook.internal.Utility;
import com.google.firebase.encoders.json.BuildConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class tc1 {
    public final View a;
    public final t21 b;
    public sc1 e;
    public gv2 f;
    public g53 g;
    public Rect l;
    public final oc1 m;
    public Function1 c = bl0.B;
    public Function1 d = bl0.C;
    public nv2 h = new nv2(BuildConfig.FLAVOR, 4, jw2.b);
    public c11 i = c11.g;
    public final ArrayList j = new ArrayList();
    public final y91 k = ya1.a(kc1.m, new u(17, this));

    public tc1(View view, ca caVar, t21 t21Var) {
        this.a = view;
        this.b = t21Var;
        this.m = new oc1(caVar, t21Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u72 a(EditorInfo editorInfo) {
        int i;
        int i2;
        int i3;
        nv2 nv2Var = this.h;
        String str = nv2Var.a.n;
        long j = nv2Var.b;
        c11 c11Var = this.i;
        int i4 = c11Var.e;
        int i5 = c11Var.d;
        boolean z = c11Var.a;
        if (i4 != 1) {
            if (i4 == 0) {
                i = 1;
            } else if (i4 == 2) {
                i = 2;
            } else if (i4 == 6) {
                i = 5;
            } else if (i4 == 5) {
                i = 7;
            } else if (i4 == 3) {
                i = 3;
            } else if (i4 == 4) {
                i = 4;
            } else {
                if (i4 != 7) {
                    lh.g("invalid ImeAction");
                    return null;
                }
                i = 6;
            }
            editorInfo.imeOptions = i;
            uf1.a.a(editorInfo, c11Var.f);
            if (i5 != 1) {
            }
            i2 = 1;
            editorInfo.inputType = i2;
            if (!z) {
            }
            i3 = editorInfo.inputType;
            if ((i3 & 1) == 1) {
            }
            int i6 = jw2.c;
            editorInfo.initialSelStart = (int) (j >> 32);
            editorInfo.initialSelEnd = (int) (j & 4294967295L);
            tf0.c(editorInfo, str);
            editorInfo.imeOptions |= 33554432;
            if (aq2.a) {
            }
            tf0.d(editorInfo, false);
            pc1 pc1Var = qc1.a;
            if (ag0.d()) {
            }
            u72 u72Var = new u72(this.h, new at0(this), this.i.c, this.e, this.f, this.g);
            this.j.add(new WeakReference(u72Var));
            return u72Var;
        }
        if (!z) {
            i = 0;
            editorInfo.imeOptions = i;
            uf1.a.a(editorInfo, c11Var.f);
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 == 3) {
                        i2 = 2;
                    } else if (i5 == 4) {
                        i2 = 3;
                    } else if (i5 == 5) {
                        i2 = 17;
                    } else if (i5 == 6) {
                        i2 = 33;
                    } else if (i5 == 7) {
                        i2 = 129;
                    } else if (i5 == 8) {
                        i2 = 18;
                    } else {
                        if (i5 != 9) {
                            lh.g("Invalid Keyboard Type");
                            return null;
                        }
                        i2 = 8194;
                    }
                    editorInfo.inputType = i2;
                    if (!z && (i2 & 1) == 1) {
                        editorInfo.inputType = 131072 | i2;
                        if (c11Var.e == 1) {
                            editorInfo.imeOptions |= 1073741824;
                        }
                    }
                    i3 = editorInfo.inputType;
                    if ((i3 & 1) == 1) {
                        int i7 = c11Var.b;
                        if (i7 == 1) {
                            editorInfo.inputType = i3 | 4096;
                        } else if (i7 == 2) {
                            editorInfo.inputType = i3 | Utility.DEFAULT_STREAM_BUFFER_SIZE;
                        } else if (i7 == 3) {
                            editorInfo.inputType = i3 | 16384;
                        }
                        if (c11Var.c) {
                            editorInfo.inputType |= 32768;
                        }
                    }
                    int i62 = jw2.c;
                    editorInfo.initialSelStart = (int) (j >> 32);
                    editorInfo.initialSelEnd = (int) (j & 4294967295L);
                    tf0.c(editorInfo, str);
                    editorInfo.imeOptions |= 33554432;
                    if (aq2.a || i5 == 7 || i5 == 8) {
                        tf0.d(editorInfo, false);
                    } else {
                        tf0.d(editorInfo, true);
                        rf0.a.a(editorInfo);
                    }
                    pc1 pc1Var2 = qc1.a;
                    if (ag0.d()) {
                        ag0.a().i(editorInfo);
                    }
                    u72 u72Var2 = new u72(this.h, new at0(this), this.i.c, this.e, this.f, this.g);
                    this.j.add(new WeakReference(u72Var2));
                    return u72Var2;
                }
                editorInfo.imeOptions |= Integer.MIN_VALUE;
            }
            i2 = 1;
            editorInfo.inputType = i2;
            if (!z) {
                editorInfo.inputType = 131072 | i2;
                if (c11Var.e == 1) {
                }
            }
            i3 = editorInfo.inputType;
            if ((i3 & 1) == 1) {
            }
            int i622 = jw2.c;
            editorInfo.initialSelStart = (int) (j >> 32);
            editorInfo.initialSelEnd = (int) (j & 4294967295L);
            tf0.c(editorInfo, str);
            editorInfo.imeOptions |= 33554432;
            if (aq2.a) {
            }
            tf0.d(editorInfo, false);
            pc1 pc1Var22 = qc1.a;
            if (ag0.d()) {
            }
            u72 u72Var22 = new u72(this.h, new at0(this), this.i.c, this.e, this.f, this.g);
            this.j.add(new WeakReference(u72Var22));
            return u72Var22;
        }
        i = 6;
        editorInfo.imeOptions = i;
        uf1.a.a(editorInfo, c11Var.f);
        if (i5 != 1) {
        }
        i2 = 1;
        editorInfo.inputType = i2;
        if (!z) {
        }
        i3 = editorInfo.inputType;
        if ((i3 & 1) == 1) {
        }
        int i6222 = jw2.c;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        tf0.c(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (aq2.a) {
        }
        tf0.d(editorInfo, false);
        pc1 pc1Var222 = qc1.a;
        if (ag0.d()) {
        }
        u72 u72Var222 = new u72(this.h, new at0(this), this.i.c, this.e, this.f, this.g);
        this.j.add(new WeakReference(u72Var222));
        return u72Var222;
    }
}
