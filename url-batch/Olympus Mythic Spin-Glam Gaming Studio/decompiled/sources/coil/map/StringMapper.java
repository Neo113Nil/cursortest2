package coil.map;

import android.net.Uri;
import coil.request.Options;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StringMapper.kt */
/* loaded from: classes3.dex */
public final class StringMapper implements Mapper {
    @Override // coil.map.Mapper
    public Uri map(String str, Options options) {
        Uri parse = Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
        return parse;
    }
}
