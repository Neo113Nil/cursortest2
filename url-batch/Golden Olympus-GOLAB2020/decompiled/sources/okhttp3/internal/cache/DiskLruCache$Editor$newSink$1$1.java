package okhttp3.internal.cache;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import okhttp3.internal.cache.DiskLruCache;

@Metadata
/* loaded from: classes3.dex */
final class DiskLruCache$Editor$newSink$1$1 extends s implements Function1<IOException, Unit> {

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ DiskLruCache f42658i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ DiskLruCache.Editor f42659j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiskLruCache$Editor$newSink$1$1(DiskLruCache diskLruCache, DiskLruCache.Editor editor) {
        super(1);
        this.f42658i = diskLruCache;
        this.f42659j = editor;
    }

    public final void a(IOException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        DiskLruCache diskLruCache = this.f42658i;
        DiskLruCache.Editor editor = this.f42659j;
        synchronized (diskLruCache) {
            editor.c();
            Unit unit = Unit.f41027a;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((IOException) obj);
        return Unit.f41027a;
    }
}
