package P0;

import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* renamed from: P0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0264f extends M2.p implements Function0 {

    /* renamed from: e, reason: collision with root package name */
    public static final C0264f f3722e = new C0264f(0, 0);

    /* renamed from: i, reason: collision with root package name */
    public static final C0264f f3723i = new C0264f(0, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final C0264f f3724j = new C0264f(0, 2);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3725d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0264f(int i2, int i4) {
        super(i2);
        this.f3725d = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f3725d) {
        }
        return UUID.randomUUID();
    }
}
