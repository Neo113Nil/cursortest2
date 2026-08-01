package o3;

import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f0 implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ViewGroup f7392a;

    public f0(ViewGroup viewGroup) {
        this.f7392a = viewGroup;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new g0(this.f7392a);
    }
}
