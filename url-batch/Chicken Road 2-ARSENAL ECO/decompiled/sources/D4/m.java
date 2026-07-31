package D4;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.function.BiConsumer;

/* loaded from: classes.dex */
public final class m implements BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public b f552a;

    /* renamed from: b, reason: collision with root package name */
    public n f553b;

    /* renamed from: c, reason: collision with root package name */
    public o f554c;

    /* renamed from: d, reason: collision with root package name */
    public i f555d;

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        try {
            this.f553b.U(this.f552a, this.f555d.e());
            this.f554c.a(this.f553b, obj, obj2, this.f555d);
            this.f553b.K();
        } catch (IOException e4) {
            throw new UncheckedIOException(e4);
        }
    }
}
