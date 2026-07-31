package kotlin.text;

import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.collections.AbstractC3211a;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
final class d implements MatchResult {

    /* renamed from: a, reason: collision with root package name */
    private final Matcher f41272a;

    /* renamed from: b, reason: collision with root package name */
    private final CharSequence f41273b;

    /* renamed from: c, reason: collision with root package name */
    private final c f41274c;

    public static final class a extends AbstractC3211a implements c {

        /* renamed from: kotlin.text.d$a$a, reason: collision with other inner class name */
        static final class C0232a extends kotlin.jvm.internal.s implements Function1 {
            C0232a() {
                super(1);
            }

            @Nullable
            public final MatchGroup a(int i4) {
                return a.this.get(i4);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).intValue());
            }
        }

        a() {
        }

        public /* bridge */ boolean b(MatchGroup matchGroup) {
            return super.contains(matchGroup);
        }

        @Override // kotlin.collections.AbstractC3211a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof MatchGroup) {
                return b((MatchGroup) obj);
            }
            return false;
        }

        @Override // kotlin.text.c
        public MatchGroup get(int i4) {
            IntRange h4;
            h4 = e.h(d.this.d(), i4);
            if (h4.l().intValue() < 0) {
                return null;
            }
            String group = d.this.d().group(i4);
            Intrinsics.checkNotNullExpressionValue(group, "group(...)");
            return new MatchGroup(group, h4);
        }

        @Override // kotlin.collections.AbstractC3211a
        public int getSize() {
            return d.this.d().groupCount() + 1;
        }

        @Override // kotlin.collections.AbstractC3211a, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return kotlin.sequences.k.y(CollectionsKt.asSequence(CollectionsKt.getIndices(this)), new C0232a()).iterator();
        }
    }

    public d(Matcher matcher, CharSequence input) {
        Intrinsics.checkNotNullParameter(matcher, "matcher");
        Intrinsics.checkNotNullParameter(input, "input");
        this.f41272a = matcher;
        this.f41273b = input;
        this.f41274c = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.regex.MatchResult d() {
        return this.f41272a;
    }

    @Override // kotlin.text.MatchResult
    public c a() {
        return this.f41274c;
    }

    @Override // kotlin.text.MatchResult
    public IntRange b() {
        IntRange g4;
        g4 = e.g(d());
        return g4;
    }

    @Override // kotlin.text.MatchResult
    public String getValue() {
        String group = d().group();
        Intrinsics.checkNotNullExpressionValue(group, "group(...)");
        return group;
    }

    @Override // kotlin.text.MatchResult
    public MatchResult next() {
        MatchResult e4;
        int end = d().end() + (d().end() == d().start() ? 1 : 0);
        if (end > this.f41273b.length()) {
            return null;
        }
        Matcher matcher = this.f41272a.pattern().matcher(this.f41273b);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        e4 = e.e(matcher, end, this.f41273b);
        return e4;
    }
}
