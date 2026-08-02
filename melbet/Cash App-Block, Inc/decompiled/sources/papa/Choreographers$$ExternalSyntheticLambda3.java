package papa;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.appcompat.app.AppCompatDelegate$$ExternalSyntheticLambda0;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Random;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import papa.internal.LaunchTracker$onActivityResumed$1$1;

/* loaded from: classes3.dex */
public final /* synthetic */ class Choreographers$$ExternalSyntheticLambda3 implements Choreographer.FrameCallback {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Choreographers$$ExternalSyntheticLambda3(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.$r8$classId = 2;
        this.f$0 = context;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                Choreographers.INSTANCE.getClass();
                Choreographers.postOnCurrentFrameRendered$papa_release((LaunchTracker$onActivityResumed$1$1) obj);
                break;
            case 1:
                ((Runnable) obj).run();
                break;
            default:
                Handler.createAsync(Looper.getMainLooper()).postDelayed(new AppCompatDelegate$$ExternalSyntheticLambda0((Context) obj, 1), new Random().nextInt(Math.max(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, 1)) + 5000);
                break;
        }
    }

    public /* synthetic */ Choreographers$$ExternalSyntheticLambda3(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }
}
