package P;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashSet f2039b = new LinkedHashSet();

    /* renamed from: c, reason: collision with root package name */
    public static final Object f2040c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final V f2041a;

    public W(V produceFile) {
        T.g serializer = T.g.f2557a;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        U coordinatorProducer = U.f2036d;
        Intrinsics.checkNotNullParameter(coordinatorProducer, "coordinatorProducer");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        this.f2041a = produceFile;
    }
}
