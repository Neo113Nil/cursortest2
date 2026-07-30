package com.crrepa.band.my.device.muslim.view;

import androidx.fragment.app.Fragment;
import com.crrepa.band.my.device.muslim.model.MuslimFunction;
import com.crrepa.band.my.device.muslim.model.MuslimPray;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public interface c {
    void renderLocationFailure(boolean z7);

    void renderLocationSuccess();

    void renderMuslimFunctionList(List<MuslimFunction> list);

    void renderNextPray(MuslimPray muslimPray);

    void renderNextPrayCountDown(String str);

    void renderPageDate(Date date);

    void renderPageIndex(int i8);

    void renderPrayPager(List<Fragment> list);
}
