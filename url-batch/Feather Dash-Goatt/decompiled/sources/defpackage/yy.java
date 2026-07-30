package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class yy implements Sequence {
    public final /* synthetic */ int a;
    public final Object b;
    public final Function1 c;

    public yy(Sequence sequence, Function1 function1) {
        this.a = 2;
        sequence.getClass();
        this.b = sequence;
        this.c = function1;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new xy(this);
            case 1:
                return new n40(this);
            default:
                return new bj1(this);
        }
    }

    public /* synthetic */ yy(Object obj, Function1 function1, int i) {
        this.a = i;
        this.b = obj;
        this.c = function1;
    }
}
