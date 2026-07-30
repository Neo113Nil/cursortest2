package k5;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.function.BiConsumer;

/* loaded from: classes.dex */
public final class k implements BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public C0602b f6090a;

    /* renamed from: b, reason: collision with root package name */
    public l f6091b;

    /* renamed from: c, reason: collision with root package name */
    public m f6092c;

    /* renamed from: d, reason: collision with root package name */
    public g f6093d;

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        try {
            this.f6091b.U(this.f6090a, this.f6093d.e());
            this.f6092c.b(this.f6091b, obj, obj2, this.f6093d);
            this.f6091b.K();
        } catch (IOException e7) {
            throw new UncheckedIOException(e7);
        }
    }
}
