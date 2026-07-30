package x5;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

/* renamed from: x5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1013c implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8377a;

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f8377a) {
            case 0:
                return new AtomicInteger(0);
            default:
                if (obj == null) {
                    return "null";
                }
                throw new ClassCastException();
        }
    }
}
