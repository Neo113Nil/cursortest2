package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ps2 implements Sequence {
    public final /* synthetic */ int a;
    public final Object b;
    public final Function1 c;

    public ps2(Sequence sequence, Function1 function1, int i) {
        this.a = i;
        sequence.getClass();
        switch (i) {
            case 1:
                this.b = sequence;
                this.c = function1;
                break;
            default:
                this.b = sequence;
                this.c = function1;
                break;
        }
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new xl0(this);
            case 1:
                return new zy2(this);
            default:
                return new wu0(this);
        }
    }

    public ps2(Function0 function0, Function1 function1) {
        this.a = 2;
        this.b = function0;
        this.c = function1;
    }
}
