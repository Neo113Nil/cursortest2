package D2;

import E2.a0;
import i2.InterfaceC2471a;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import y2.InterfaceC3527b;
import y2.InterfaceC3533h;

@InterfaceC3533h(with = y.class)
@Metadata
/* loaded from: classes3.dex */
public final class w extends i implements Map<String, i>, InterfaceC2471a {

    @NotNull
    public static final a Companion = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final Map f427b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InterfaceC3527b serializer() {
            return y.f430a;
        }

        private a() {
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f428i = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Map.Entry entry) {
            Intrinsics.checkNotNullParameter(entry, "<name for destructuring parameter 0>");
            String str = (String) entry.getKey();
            i iVar = (i) entry.getValue();
            StringBuilder sb = new StringBuilder();
            a0.c(sb, str);
            sb.append(':');
            sb.append(iVar);
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Map content) {
        super(null);
        Intrinsics.checkNotNullParameter(content, "content");
        this.f427b = content;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ i compute(String str, BiFunction<? super String, ? super i, ? extends i> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ i computeIfAbsent(String str, Function<? super String, ? extends i> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ i computeIfPresent(String str, BiFunction<? super String, ? super i, ? extends i> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return e((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof i) {
            return f((i) obj);
        }
        return false;
    }

    public boolean e(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f427b.containsKey(key);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, i>> entrySet() {
        return h();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return Intrinsics.areEqual(this.f427b, obj);
    }

    public boolean f(i value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f427b.containsValue(value);
    }

    public i g(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (i) this.f427b.get(key);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ i get(Object obj) {
        if (obj instanceof String) {
            return g((String) obj);
        }
        return null;
    }

    public Set h() {
        return this.f427b.entrySet();
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f427b.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f427b.isEmpty();
    }

    public Set k() {
        return this.f427b.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return k();
    }

    public int l() {
        return this.f427b.size();
    }

    public Collection m() {
        return this.f427b.values();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ i merge(String str, i iVar, BiFunction<? super i, ? super i, ? extends i> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public i remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ i put(String str, i iVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends i> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ i putIfAbsent(String str, i iVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ i replace(String str, i iVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super String, ? super i, ? extends i> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return l();
    }

    public String toString() {
        return CollectionsKt.joinToString$default(this.f427b.entrySet(), StringUtils.COMMA, "{", "}", 0, null, b.f428i, 24, null);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<i> values() {
        return m();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ boolean replace(String str, i iVar, i iVar2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
