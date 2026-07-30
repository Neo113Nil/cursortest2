package com.crrepa.band.my.home.guidance;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.crrepa.band.my.MainActivity;
import com.crrepa.band.my.device.scan.BandScanActivity;
import com.crrepa.band.my.home.guidance.info.GuidanceSetAgeActivity;
import com.crrepa.band.my.home.guidance.info.GuidanceSetGenderActivity;
import com.crrepa.band.my.home.guidance.info.GuidanceSetHeightActivity;
import com.crrepa.band.my.home.guidance.info.GuidanceSetStepLengthActivity;
import com.crrepa.band.my.home.guidance.info.GuidanceSetWeightActivity;
import com.crrepa.band.my.home.guidance.permission.BluetoothPermissionActivity;
import com.crrepa.band.my.home.guidance.permission.LocationPermissionActivity;
import com.crrepa.band.my.home.guidance.permission.NotificationPermissionActivity;
import com.crrepa.band.my.model.user.provider.UserWeightProvider;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class a {
    private static final List<Class<?>> intentList = new ArrayList();

    public static class b {
        public static final a INSTANCE = new a();
    }

    public static a getInstance() {
        return b.INSTANCE;
    }

    public static Intent getLastGuidanceIntent(Context context) {
        int guidanceState = com.crrepa.band.my.home.guidance.b.getGuidanceState();
        if (guidanceState == 0) {
            return MainActivity.getCallingIntent(context);
        }
        if (guidanceState == -1 || guidanceState == 1) {
            return new Intent(context, (Class<?>) GuidanceSetGenderActivity.class);
        }
        if (guidanceState == 2) {
            return new Intent(context, (Class<?>) GuidanceSetAgeActivity.class);
        }
        if (guidanceState == 3) {
            return new Intent(context, (Class<?>) GuidanceSetHeightActivity.class);
        }
        if (guidanceState == 4) {
            return new Intent(context, (Class<?>) GuidanceSetWeightActivity.class);
        }
        if (guidanceState == 5) {
            return new Intent(context, (Class<?>) GuidanceSetStepLengthActivity.class);
        }
        switch (guidanceState) {
        }
        return MainActivity.getCallingIntent(context);
    }

    public void firstStartPermissionActivity(Context context) {
        UserWeightProvider.insertWeight(UserWeightProvider.getUserWeight() - UserWeightProvider.getCurrentMinWeight());
        startNextPermissionActivity(context);
    }

    public Intent getNextPermissionIntent(Context context) {
        List<Class<?>> list = intentList;
        return (list.isEmpty() || list.get(0) == null) ? BandScanActivity.getCallingIntent(context, true) : new Intent(context, list.remove(0));
    }

    public void initGuidancePermissionList() {
        List<Class<?>> list = intentList;
        list.clear();
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 33 && com.crrepa.band.my.home.guidance.b.getGuidanceState() <= 10) {
            list.add(NotificationPermissionActivity.class);
        }
        if (i8 >= 31 && com.crrepa.band.my.home.guidance.b.getGuidanceState() <= 11) {
            list.add(LocationPermissionActivity.class);
        }
        if (i8 < 31 || com.crrepa.band.my.home.guidance.b.getGuidanceState() > 12) {
            return;
        }
        list.add(BluetoothPermissionActivity.class);
    }

    public void startGuidanceActivity(Context context) {
        Intent intent = new Intent(context, (Class<?>) GuidanceSetGenderActivity.class);
        intent.addFlags(268468224);
        context.startActivity(intent);
    }

    public void startNextPermissionActivity(Context context) {
        Intent nextPermissionIntent = getNextPermissionIntent(context);
        nextPermissionIntent.addFlags(268468224);
        context.startActivity(nextPermissionIntent);
    }

    private a() {
    }
}
