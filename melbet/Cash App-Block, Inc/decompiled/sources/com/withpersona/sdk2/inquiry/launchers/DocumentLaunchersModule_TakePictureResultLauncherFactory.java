package com.withpersona.sdk2.inquiry.launchers;

import androidx.activity.result.ActivityResultLauncher;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import io.noties.markwon.MarkwonImpl;

/* loaded from: classes9.dex */
public final class DocumentLaunchersModule_TakePictureResultLauncherFactory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public final MarkwonImpl module;

    public /* synthetic */ DocumentLaunchersModule_TakePictureResultLauncherFactory(MarkwonImpl markwonImpl, int i) {
        this.$r8$classId = i;
        this.module = markwonImpl;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i = this.$r8$classId;
        MarkwonImpl markwonImpl = this.module;
        switch (i) {
            case 0:
                ActivityResultLauncher activityResultLauncher = (ActivityResultLauncher) markwonImpl.parser;
                Preconditions.checkNotNullFromProvides(activityResultLauncher);
                return activityResultLauncher;
            case 1:
                ActivityResultLauncher activityResultLauncher2 = (ActivityResultLauncher) markwonImpl.visitorFactory;
                Preconditions.checkNotNullFromProvides(activityResultLauncher2);
                return activityResultLauncher2;
            default:
                ActivityResultLauncher activityResultLauncher3 = (ActivityResultLauncher) markwonImpl.plugins;
                Preconditions.checkNotNullFromProvides(activityResultLauncher3);
                return activityResultLauncher3;
        }
    }
}
