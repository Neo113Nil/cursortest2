package expo.modules.updatesinterface;

import android.net.Uri;
import expo.modules.updates.UpdatesConfiguration;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.Metadata;
import org.json.JSONObject;

/* compiled from: UpdatesInterface.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0002\u001b\u001cJ\b\u0010\t\u001a\u00020\nH&J4\u0010\u000b\u001a\u00020\n2\"\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0001`\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&J,\u0010\u0012\u001a\u00020\u00132\"\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0001`\u000fH&R \u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u0018X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lexpo/modules/updatesinterface/UpdatesInterface;", "", "updatesInterfaceCallbacks", "Ljava/lang/ref/WeakReference;", "Lexpo/modules/updatesinterface/UpdatesInterfaceCallbacks;", "getUpdatesInterfaceCallbacks", "()Ljava/lang/ref/WeakReference;", "setUpdatesInterfaceCallbacks", "(Ljava/lang/ref/WeakReference;)V", "reset", "", "fetchUpdateWithConfiguration", "configuration", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "callback", "Lexpo/modules/updatesinterface/UpdatesInterface$UpdateCallback;", "isValidUpdatesConfiguration", "", UpdatesConfiguration.UPDATES_CONFIGURATION_RUNTIME_VERSION_KEY, "getRuntimeVersion", "()Ljava/lang/String;", UpdatesConfiguration.UPDATES_CONFIGURATION_UPDATE_URL_KEY, "Landroid/net/Uri;", "getUpdateUrl", "()Landroid/net/Uri;", "UpdateCallback", "Update", "expo-updates-interface_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface UpdatesInterface {

    /* compiled from: UpdatesInterface.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lexpo/modules/updatesinterface/UpdatesInterface$Update;", "", "manifest", "Lorg/json/JSONObject;", "getManifest", "()Lorg/json/JSONObject;", "launchAssetPath", "", "getLaunchAssetPath", "()Ljava/lang/String;", "expo-updates-interface_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Update {
        String getLaunchAssetPath();

        JSONObject getManifest();
    }

    /* compiled from: UpdatesInterface.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H&J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH&J \u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH&J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H&¨\u0006\u0013"}, d2 = {"Lexpo/modules/updatesinterface/UpdatesInterface$UpdateCallback;", "", "onFailure", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "update", "Lexpo/modules/updatesinterface/UpdatesInterface$Update;", "onProgress", "successfulAssetCount", "", "failedAssetCount", "totalAssetCount", "onManifestLoaded", "", "manifest", "Lorg/json/JSONObject;", "expo-updates-interface_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface UpdateCallback {
        void onFailure(Exception e);

        boolean onManifestLoaded(JSONObject manifest);

        void onProgress(int successfulAssetCount, int failedAssetCount, int totalAssetCount);

        void onSuccess(Update update);
    }

    void fetchUpdateWithConfiguration(HashMap<String, Object> configuration, UpdateCallback callback);

    String getRuntimeVersion();

    Uri getUpdateUrl();

    WeakReference<UpdatesInterfaceCallbacks> getUpdatesInterfaceCallbacks();

    boolean isValidUpdatesConfiguration(HashMap<String, Object> configuration);

    void reset();

    void setUpdatesInterfaceCallbacks(WeakReference<UpdatesInterfaceCallbacks> weakReference);
}
