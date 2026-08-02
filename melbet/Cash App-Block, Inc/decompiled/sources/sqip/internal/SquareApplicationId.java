package sqip.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import sqip.InAppPaymentsSdk;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u001d\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00022\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0096\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0002J%\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00022\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lsqip/internal/SquareApplicationId;", "Lkotlin/properties/ReadWriteProperty;", "Lsqip/InAppPaymentsSdk;", "", "()V", "METADATA_SQUARE_APPLICATION_ID_KEY", "id", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "readSquareApplicationIdFromAndroidManifest", "setValue", "", "value", "nonce-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SquareApplicationId implements ReadWriteProperty {
    public static final SquareApplicationId INSTANCE = new SquareApplicationId();
    private static final String METADATA_SQUARE_APPLICATION_ID_KEY = "sqip.SQUARE_APPLICATION_ID";
    private static String id;

    private SquareApplicationId() {
    }

    private final String readSquareApplicationIdFromAndroidManifest() {
        Context providerContext = ContextCaptureContentProvider.INSTANCE.getProviderContext();
        ApplicationInfo applicationInfo = providerContext.getPackageManager().getApplicationInfo(providerContext.getPackageName(), 128);
        applicationInfo.getClass();
        String string2 = applicationInfo.metaData.getString(METADATA_SQUARE_APPLICATION_ID_KEY);
        if (string2 != null) {
            return string2;
        }
        OptionalProvider$$ExternalSyntheticLambda0.m$1("The Square Application Id must be set, either by setting a <meta-data> tag with a android:name=\"sqip.SQUARE_APPLICATION_ID\"> attribute under the <application> tag of your AndroidManifest.xml, or by calling InAppPaymentsSdk.setSquareApplicationId()");
        return null;
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public String getValue(InAppPaymentsSdk thisRef, KProperty property) {
        thisRef.getClass();
        property.getClass();
        if (id == null) {
            id = readSquareApplicationIdFromAndroidManifest();
        }
        String str = id;
        str.getClass();
        return str;
    }

    @Override // kotlin.properties.ReadWriteProperty
    public void setValue(InAppPaymentsSdk thisRef, KProperty property, String value) {
        thisRef.getClass();
        property.getClass();
        value.getClass();
        id = value;
    }
}
