package de;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3709a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3710b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f3711c;

    public /* synthetic */ d(Object obj, Function1 function1, int i3) {
        this.f3709a = i3;
        this.f3710b = obj;
        this.f3711c = function1;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        switch (this.f3709a) {
            case 0:
                return new c(this);
            default:
                return new e(this);
        }
    }
}
