package h1;

import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y2.C1336k;
import y2.InterfaceC1335j;
import z3.r;

/* renamed from: h1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0653f {

    /* renamed from: e, reason: collision with root package name */
    public static final LinkedHashSet f6839e = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public static final E1.i f6840f = new E1.i(13);

    /* renamed from: a, reason: collision with root package name */
    public final r f6841a;

    /* renamed from: b, reason: collision with root package name */
    public final Function2 f6842b;

    /* renamed from: c, reason: collision with root package name */
    public final A3.e f6843c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1335j f6844d;

    public C0653f(r fileSystem, A3.e producePath) {
        j1.h serializer = j1.h.f7154a;
        C0651d coordinatorProducer = C0651d.f6836d;
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(coordinatorProducer, "coordinatorProducer");
        Intrinsics.checkNotNullParameter(producePath, "producePath");
        this.f6841a = fileSystem;
        this.f6842b = coordinatorProducer;
        this.f6843c = producePath;
        this.f6844d = C1336k.a(new C0652e(this, 0));
    }
}
