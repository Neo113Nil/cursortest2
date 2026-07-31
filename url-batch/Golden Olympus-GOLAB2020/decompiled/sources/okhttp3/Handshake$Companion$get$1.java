package okhttp3;

import java.security.cert.Certificate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes3.dex */
final class Handshake$Companion$get$1 extends s implements Function0<List<? extends Certificate>> {

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ List f42384i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Handshake$Companion$get$1(List list) {
        super(0);
        this.f42384i = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List invoke() {
        return this.f42384i;
    }
}
