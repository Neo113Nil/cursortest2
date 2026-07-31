package gbcorp.c312.merkmarker.info.data.datastore;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.core.Preferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;

/* compiled from: MRKMROnboardingPrefs.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"%\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"MRKMR_PREFS_NAME", "", "mrkmrOnboardingStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "Landroid/content/Context;", "getMrkmrOnboardingStore", "(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", "mrkmrOnboardingStore$delegate", "Lkotlin/properties/ReadOnlyProperty;", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MRKMROnboardingPrefsKt {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {new PropertyReference1Impl(MRKMROnboardingPrefsKt.class, "mrkmrOnboardingStore", "getMrkmrOnboardingStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1)};
    private static final String MRKMR_PREFS_NAME = "mrkmr_prefs";
    private static final ReadOnlyProperty mrkmrOnboardingStore$delegate = PreferenceDataStoreDelegateKt.preferencesDataStore$default(MRKMR_PREFS_NAME, null, null, null, 14, null);

    public static final DataStore<Preferences> getMrkmrOnboardingStore(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (DataStore) mrkmrOnboardingStore$delegate.getValue(context, $$delegatedProperties[0]);
    }
}
