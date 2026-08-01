package zd;

import java.util.Random;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends zd.a {

    /* renamed from: i, reason: collision with root package name */
    public final a f10963i = new a();

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        public final Object initialValue() {
            return new Random();
        }
    }

    @Override // zd.a
    public final Random d() {
        Object obj = this.f10963i.get();
        obj.getClass();
        return (Random) obj;
    }
}
