package gbcorp.c312.merkmarker.info.util;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import gbcorp.c312.merkmarker.info.data.repository.GTSLYPrepRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GTSLYInstallReferrerManager.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lgbcorp/c312/merkmarker/info/util/GTSLYInstallReferrerManager;", "", "context", "Landroid/content/Context;", "repository", "Lgbcorp/c312/merkmarker/info/data/repository/GTSLYPrepRepository;", "<init>", "(Landroid/content/Context;Lgbcorp/c312/merkmarker/info/data/repository/GTSLYPrepRepository;)V", "referrerClient", "Lcom/android/installreferrer/api/InstallReferrerClient;", "kotlin.jvm.PlatformType", "fetchAndStoreInstallReferrer", "", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GTSLYInstallReferrerManager {
    public static final int $stable = 8;
    private final InstallReferrerClient referrerClient;
    private final GTSLYPrepRepository repository;

    public GTSLYInstallReferrerManager(Context context, GTSLYPrepRepository repository) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
        this.referrerClient = InstallReferrerClient.newBuilder(context).build();
    }

    public final void fetchAndStoreInstallReferrer() {
        String storedReferrer = this.repository.getStoredReferrer();
        if (storedReferrer == null || storedReferrer.length() == 0) {
            this.referrerClient.startConnection(new InstallReferrerStateListener() { // from class: gbcorp.c312.merkmarker.info.util.GTSLYInstallReferrerManager$fetchAndStoreInstallReferrer$1
                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public void onInstallReferrerSetupFinished(int responseCode) {
                    GTSLYPrepRepository gTSLYPrepRepository;
                    InstallReferrerClient installReferrerClient;
                    GTSLYPrepRepository gTSLYPrepRepository2;
                    InstallReferrerClient installReferrerClient2;
                    if (responseCode == 0) {
                        installReferrerClient = GTSLYInstallReferrerManager.this.referrerClient;
                        String installReferrer = installReferrerClient.getInstallReferrer().getInstallReferrer();
                        gTSLYPrepRepository2 = GTSLYInstallReferrerManager.this.repository;
                        Intrinsics.checkNotNull(installReferrer);
                        gTSLYPrepRepository2.storeInstallReferrer(installReferrer);
                        installReferrerClient2 = GTSLYInstallReferrerManager.this.referrerClient;
                        installReferrerClient2.endConnection();
                        return;
                    }
                    gTSLYPrepRepository = GTSLYInstallReferrerManager.this.repository;
                    gTSLYPrepRepository.storeInstallReferrer("");
                }

                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public void onInstallReferrerServiceDisconnected() {
                    GTSLYPrepRepository gTSLYPrepRepository;
                    gTSLYPrepRepository = GTSLYInstallReferrerManager.this.repository;
                    gTSLYPrepRepository.storeInstallReferrer("");
                }
            });
        }
    }
}
