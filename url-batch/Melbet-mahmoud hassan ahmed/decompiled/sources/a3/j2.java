package a3;

import android.annotation.TargetApi;
import android.os.Environment;
import android.os.StatFs;
import android.view.View;

@TargetApi(18)
/* loaded from: classes.dex */
public class j2 extends i2 {
    @Override // a3.f
    public final int g() {
        return 14;
    }

    @Override // a3.f
    public final long h() {
        return new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
    }

    @Override // a3.f
    public boolean i(View view) {
        return super.i(view) || view.getWindowId() != null;
    }
}
