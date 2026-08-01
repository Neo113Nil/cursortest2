package de;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3723a;

    /* renamed from: b, reason: collision with root package name */
    public final Sequence f3724b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f3725c;

    public o(Sequence sequence, Function1 function1, int i3) {
        this.f3723a = i3;
        sequence.getClass();
        switch (i3) {
            case 1:
                this.f3724b = sequence;
                this.f3725c = function1;
                break;
            default:
                this.f3724b = sequence;
                this.f3725c = function1;
                break;
        }
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        switch (this.f3723a) {
            case 0:
                return new c(this);
            default:
                return new p(this);
        }
    }
}
