package kotlinx.coroutines;

/* loaded from: classes3.dex */
public interface t extends u0 {
    boolean childCancelled(Throwable th);

    @Override // kotlinx.coroutines.u0
    /* synthetic */ void dispose();

    l1 getParent();
}
