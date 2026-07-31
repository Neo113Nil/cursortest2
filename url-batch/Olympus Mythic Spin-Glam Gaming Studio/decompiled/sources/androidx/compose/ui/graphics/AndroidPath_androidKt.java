package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidPath.android.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/graphics/Path;", "Path", "()Landroidx/compose/ui/graphics/Path;", "Landroid/graphics/Path;", "asComposePath", "(Landroid/graphics/Path;)Landroidx/compose/ui/graphics/Path;", "ui-graphics_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidPath_androidKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final Path Path() {
        return new AndroidPath(null, 1, 0 == true ? 1 : 0);
    }

    public static final Path asComposePath(android.graphics.Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return new AndroidPath(path);
    }
}
