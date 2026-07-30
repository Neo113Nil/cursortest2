package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class sb {
    public static final /* synthetic */ AtomicIntegerFieldUpdater lS5Rgt96tfkO = AtomicIntegerFieldUpdater.newUpdater(sb.class, "notCompletedCount$volatile");
    public final mx[] PxuCJdSBwIXG;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public sb(mx[] mxVarArr) {
        this.PxuCJdSBwIXG = mxVarArr;
        this.notCompletedCount$volatile = mxVarArr.length;
    }
}
