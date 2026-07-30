package com.yhao.floatwindow;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class FloatActivity extends Activity {
    private static b mPermissionListener;
    private static List<b> mPermissionListenerList;

    static class a implements b {
        a() {
        }

        @Override // com.yhao.floatwindow.b
        public void onFail() {
            Iterator it = FloatActivity.mPermissionListenerList.iterator();
            while (it.hasNext()) {
                ((b) it.next()).onFail();
            }
            FloatActivity.mPermissionListenerList.clear();
        }

        @Override // com.yhao.floatwindow.b
        public void onSuccess() {
            Iterator it = FloatActivity.mPermissionListenerList.iterator();
            while (it.hasNext()) {
                ((b) it.next()).onSuccess();
            }
            FloatActivity.mPermissionListenerList.clear();
        }
    }

    static synchronized void request(Context context, b bVar) {
        synchronized (FloatActivity.class) {
            if (c.hasPermission(context)) {
                bVar.onSuccess();
                return;
            }
            if (mPermissionListenerList == null) {
                mPermissionListenerList = new ArrayList();
                mPermissionListener = new a();
                Intent intent = new Intent(context, (Class<?>) FloatActivity.class);
                intent.setFlags(268435456);
                context.startActivity(intent);
            }
            mPermissionListenerList.add(bVar);
        }
    }

    @RequiresApi(api = 23)
    private void requestAlertWindowPermission() {
        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
        intent.setData(Uri.parse("package:" + getPackageName()));
        startActivityForResult(intent, 756232212);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (i8 == 756232212) {
            if (c.hasPermissionOnActivityResult(this)) {
                mPermissionListener.onSuccess();
            } else {
                mPermissionListener.onFail();
            }
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 23) {
            requestAlertWindowPermission();
        }
    }
}
