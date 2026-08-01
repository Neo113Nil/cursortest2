package de;

import hd.u;
import java.util.Iterator;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3719a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3720b;

    public /* synthetic */ j(int i3, Object obj) {
        this.f3719a = i3;
        this.f3720b = obj;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        switch (this.f3719a) {
            case 0:
                return (Iterator) this.f3720b;
            case 1:
                return new u((Object[]) this.f3720b);
            case 2:
                return ((Iterable) this.f3720b).iterator();
            default:
                return new sd.m(this);
        }
    }
}
