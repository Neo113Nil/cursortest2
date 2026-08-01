package d6;

import androidx.work.impl.WorkDatabase;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase f3635a;

    public f(WorkDatabase workDatabase, int i3) {
        switch (i3) {
            case 1:
                this.f3635a = workDatabase;
                break;
            default:
                workDatabase.getClass();
                this.f3635a = workDatabase;
                break;
        }
    }
}
