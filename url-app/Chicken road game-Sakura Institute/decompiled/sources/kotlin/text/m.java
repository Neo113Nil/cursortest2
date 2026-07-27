package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
final class m extends M2.p implements Function1<String, String> {

    /* renamed from: d, reason: collision with root package name */
    public static final m f7542d = new m(1);

    public m() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke(String line) {
        Intrinsics.checkNotNullParameter(line, "line");
        return line;
    }
}
