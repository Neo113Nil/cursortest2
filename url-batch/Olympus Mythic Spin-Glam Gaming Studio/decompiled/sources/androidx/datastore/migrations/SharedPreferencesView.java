package androidx.datastore.migrations;

import android.content.SharedPreferences;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SharedPreferencesMigration.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/datastore/migrations/SharedPreferencesView;", "", "Landroid/content/SharedPreferences;", "prefs", "", "", "keySet", "<init>", "(Landroid/content/SharedPreferences;Ljava/util/Set;)V", "Landroid/content/SharedPreferences;", "Ljava/util/Set;", "datastore_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes14.dex */
public final class SharedPreferencesView {
    private final Set keySet;
    private final SharedPreferences prefs;

    public SharedPreferencesView(SharedPreferences prefs, Set set) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        this.prefs = prefs;
        this.keySet = set;
    }
}
