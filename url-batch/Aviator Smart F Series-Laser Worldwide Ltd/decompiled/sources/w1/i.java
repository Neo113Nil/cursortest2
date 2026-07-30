package w1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextUtils;
import com.crrepa.band.my.model.WatchFaceSvgModel;
import com.crrepa.band.my.model.WatchFaceSvgPathModel;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class i {
    public static Bitmap getSvgBitmap(WatchFaceSvgModel watchFaceSvgModel) {
        Bitmap createBitmap = Bitmap.createBitmap(watchFaceSvgModel.getSvgWidth(), watchFaceSvgModel.getSvgHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        if (watchFaceSvgModel.isPureBlack()) {
            canvas.drawColor(-1);
        } else {
            canvas.drawColor(-16777216);
        }
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(1.0f);
        paint.setAntiAlias(true);
        ArrayList<WatchFaceSvgPathModel> pathModels = watchFaceSvgModel.getPathModels();
        for (int i8 = 0; i8 < pathModels.size(); i8++) {
            WatchFaceSvgPathModel watchFaceSvgPathModel = pathModels.get(i8);
            paint.setColor(Color.parseColor(watchFaceSvgPathModel.getColor()));
            if (!TextUtils.isEmpty(watchFaceSvgPathModel.getFillAlpha())) {
                paint.setAlpha((int) (Float.parseFloat(watchFaceSvgPathModel.getFillAlpha()) * 255.0f));
            }
            Path path = watchFaceSvgPathModel.getPath();
            canvas.drawPath(path, paint);
            if (watchFaceSvgPathModel.isClipPath()) {
                canvas.clipPath(path);
            }
        }
        return createBitmap;
    }
}
