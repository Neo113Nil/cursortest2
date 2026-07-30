package defpackage;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class qn1 {
    public final List PxuCJdSBwIXG;
    public final int TSizfFm2Yiuu;
    public final int Y1f8riQaR6yg;
    public int a92UlCVFR9N8;
    public final int e9gEMXR7LXtO;
    public final op0 lS5Rgt96tfkO;

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qn1(List list, op0 op0Var) {
        boolean z;
        boolean z2;
        int actionMasked;
        int classification;
        int classification2;
        MotionEvent PxuCJdSBwIXG;
        this.PxuCJdSBwIXG = list;
        this.lS5Rgt96tfkO = op0Var;
        int i = Build.VERSION.SDK_INT;
        int i2 = 0;
        this.TSizfFm2Yiuu = (i < 29 || (PxuCJdSBwIXG = PxuCJdSBwIXG()) == null) ? 0 : PxuCJdSBwIXG.getClassification();
        MotionEvent PxuCJdSBwIXG2 = PxuCJdSBwIXG();
        this.Y1f8riQaR6yg = PxuCJdSBwIXG2 != null ? PxuCJdSBwIXG2.getButtonState() : 0;
        MotionEvent PxuCJdSBwIXG3 = PxuCJdSBwIXG();
        this.e9gEMXR7LXtO = PxuCJdSBwIXG3 != null ? PxuCJdSBwIXG3.getMetaState() : 0;
        MotionEvent PxuCJdSBwIXG4 = PxuCJdSBwIXG();
        if (PxuCJdSBwIXG4 != null) {
            if (i >= 29) {
                classification2 = PxuCJdSBwIXG4.getClassification();
                if (classification2 == 3) {
                    z = true;
                    if (i >= 29) {
                        classification = PxuCJdSBwIXG4.getClassification();
                        if (classification == 5) {
                            z2 = true;
                            actionMasked = PxuCJdSBwIXG4.getActionMasked();
                            if (actionMasked != 0) {
                                if (actionMasked != 1) {
                                    if (actionMasked != 2) {
                                        switch (actionMasked) {
                                            case 5:
                                                if (!z) {
                                                    if (!z2) {
                                                        un1.Companion.getClass();
                                                        i2 = 1;
                                                        break;
                                                    } else {
                                                        un1.Companion.getClass();
                                                        i2 = 8;
                                                        break;
                                                    }
                                                } else {
                                                    un1.Companion.getClass();
                                                    i2 = 10;
                                                    break;
                                                }
                                            case 6:
                                                if (!z) {
                                                    if (!z2) {
                                                        un1.Companion.getClass();
                                                        i2 = 2;
                                                        break;
                                                    } else {
                                                        un1.Companion.getClass();
                                                        i2 = 8;
                                                        break;
                                                    }
                                                } else {
                                                    un1.Companion.getClass();
                                                    i2 = 12;
                                                    break;
                                                }
                                            case 7:
                                                break;
                                            case 8:
                                                un1.Companion.getClass();
                                                i2 = 6;
                                                break;
                                            case 9:
                                                un1.Companion.getClass();
                                                i2 = 4;
                                                break;
                                            case 10:
                                                un1.Companion.getClass();
                                                i2 = 5;
                                                break;
                                            default:
                                                un1.Companion.getClass();
                                                break;
                                        }
                                    }
                                    if (z) {
                                        un1.Companion.getClass();
                                        i2 = 11;
                                    } else if (z2) {
                                        un1.Companion.getClass();
                                        i2 = 8;
                                    } else {
                                        un1.Companion.getClass();
                                        i2 = 3;
                                    }
                                } else if (z) {
                                    un1.Companion.getClass();
                                    i2 = 12;
                                } else if (z2) {
                                    un1.Companion.getClass();
                                    i2 = 9;
                                } else {
                                    un1.Companion.getClass();
                                    i2 = 2;
                                }
                            } else if (z) {
                                un1.Companion.getClass();
                                i2 = 10;
                            } else if (z2) {
                                un1.Companion.getClass();
                                i2 = 7;
                            } else {
                                un1.Companion.getClass();
                                i2 = 1;
                            }
                        }
                    }
                    z2 = false;
                    actionMasked = PxuCJdSBwIXG4.getActionMasked();
                    if (actionMasked != 0) {
                    }
                }
            }
            z = false;
            if (i >= 29) {
            }
            z2 = false;
            actionMasked = PxuCJdSBwIXG4.getActionMasked();
            if (actionMasked != 0) {
            }
        } else {
            int size = list.size();
            while (i2 < size) {
                ao1 ao1Var = (ao1) list.get(i2);
                if (ni0.x50lh2ztY7Y5(ao1Var)) {
                    un1.Companion.getClass();
                    i2 = 2;
                } else if (ni0.wdg6QnbFHrFF(ao1Var)) {
                    un1.Companion.getClass();
                    i2 = 1;
                } else {
                    i2++;
                }
            }
            un1.Companion.getClass();
            i2 = 3;
        }
        this.a92UlCVFR9N8 = i2;
    }

    public final MotionEvent PxuCJdSBwIXG() {
        op0 op0Var = this.lS5Rgt96tfkO;
        if (op0Var != null) {
            return (MotionEvent) ((op0) op0Var.wdg6QnbFHrFF).wdg6QnbFHrFF;
        }
        return null;
    }
}
