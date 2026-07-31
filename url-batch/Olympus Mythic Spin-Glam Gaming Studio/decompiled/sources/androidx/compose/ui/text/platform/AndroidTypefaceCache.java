package androidx.compose.ui.text.platform;

import androidx.collection.LruCache;
import kotlin.Deprecated;
import kotlin.Metadata;

/* compiled from: AndroidFontListTypeface.android.kt */
@Deprecated
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidTypefaceCache;", "", "<init>", "()V", "Landroidx/collection/LruCache;", "", "Landroid/graphics/Typeface;", "cache", "Landroidx/collection/LruCache;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AndroidTypefaceCache {
    public static final AndroidTypefaceCache INSTANCE = new AndroidTypefaceCache();
    private static final LruCache cache = new LruCache(16);

    private AndroidTypefaceCache() {
    }
}
