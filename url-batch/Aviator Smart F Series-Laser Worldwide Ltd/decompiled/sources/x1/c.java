package x1;

import android.graphics.Bitmap;
import com.crrepa.band.my.model.PresetWatchFaceModel;
import com.squareup.picasso.v;
import com.yalantis.ucrop.UCrop;
import java.util.List;

/* loaded from: classes2.dex */
public interface c {
    void renderCropError(String str);

    void renderCropView(UCrop uCrop);

    void renderDisconnectHint();

    void renderLowBatteryHint();

    void renderPresetWatchFace(List<PresetWatchFaceModel> list);

    void renderRoundedRectangleScreen();

    void renderTransCompleted();

    void renderTransError();

    void renderTransProgressChanged(int i8);

    void renderTransProgressStarting();

    void renderTransTimeout();

    void renderWatchFaceBackground(Bitmap bitmap, int i8);

    void renderWatchFaceBackground(v vVar);

    void renderWatchFaceRatio(float f8);

    void renderWatchFaceTextColor(int i8);

    void renderWatchFaceTimeBottomContent(int i8, float f8);

    void renderWatchFaceTimePosition(int i8, boolean z7, boolean z8, float f8);

    void renderWatchFaceTimeTopContent(int i8, float f8);

    void rendercCircleScreen();
}
