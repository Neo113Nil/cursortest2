package defpackage;

import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class mm1 implements yi0 {
    public final View PxuCJdSBwIXG;

    public mm1(View view) {
        this.PxuCJdSBwIXG = view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
    
        if (r9 != 17) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
    
        if (r1 == 9) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0082 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void PxuCJdSBwIXG(int i) {
        int i2;
        aj0.Companion.getClass();
        int i3 = 0;
        if (i == 16) {
            i2 = 16;
        } else if (i == 6) {
            i2 = 6;
        } else if (i == 13) {
            i2 = 13;
        } else {
            i2 = 23;
            if (i != 23) {
                i2 = 3;
                if (i != 3) {
                    if (i == 0) {
                        i2 = 0;
                    } else if (i == 17) {
                        i2 = 17;
                    } else if (i == 27) {
                        i2 = 27;
                    } else {
                        i2 = 26;
                        if (i != 26) {
                            if (i == 9) {
                                i2 = 9;
                            } else {
                                i2 = 22;
                                if (i != 22) {
                                    i2 = 21;
                                    if (i != 21) {
                                        i2 = i == 1 ? 1 : -1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int i4 = rq2.PxuCJdSBwIXG;
        if (i2 != -1) {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 < 34) {
                switch (i2) {
                    case 21:
                    case 23:
                    case 26:
                        i2 = 6;
                        break;
                    case 22:
                    case 24:
                    case 27:
                        i2 = 4;
                        break;
                    case 25:
                        i2 = 0;
                        break;
                }
            }
            if (i5 < 30) {
                if (i2 != 12) {
                    if (i2 == 13) {
                        i3 = 6;
                    } else if (i2 != 16) {
                    }
                    if (i5 < 27) {
                        if (i3 == 7) {
                            if (i3 == 8) {
                            }
                        }
                    }
                    if (i3 != -1) {
                        return;
                    }
                    this.PxuCJdSBwIXG.performHapticFeedback(i3);
                    return;
                }
                i3 = 1;
                if (i5 < 27) {
                }
                if (i3 != -1) {
                }
            }
            i3 = i2;
            if (i5 < 27) {
            }
            if (i3 != -1) {
            }
        }
        i3 = -1;
        if (i3 != -1) {
        }
    }
}
