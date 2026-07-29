package com.cmplay.kinfoc.report;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class ScreenObserver {
    private static final String TAG = "drpt";
    private static Method mReflectScreenState;
    private Context mContext;
    private a mScreenReceiver = new a();
    private b mScreenStateListener;

    public interface b {
        void a();

        void b();
    }

    public ScreenObserver(Context context) {
        this.mContext = context;
        try {
            mReflectScreenState = PowerManager.class.getMethod("isScreenOn", new Class[0]);
        } catch (NoSuchMethodException e) {
            Log.d(TAG, "API < 7," + e);
        }
    }

    private class a extends BroadcastReceiver {

        /* renamed from: b, reason: collision with root package name */
        private String f4398b;

        private a() {
            this.f4398b = null;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            this.f4398b = intent.getAction();
            if ("android.intent.action.SCREEN_ON".equals(this.f4398b)) {
                ScreenObserver.this.mScreenStateListener.a();
            } else if ("android.intent.action.SCREEN_OFF".equals(this.f4398b)) {
                ScreenObserver.this.mScreenStateListener.b();
            }
        }
    }

    public void requestScreenStateUpdate(b bVar) {
        this.mScreenStateListener = bVar;
        startScreenBroadcastReceiver();
        firstGetScreenState();
    }

    private void firstGetScreenState() {
        if (isScreenOn((PowerManager) this.mContext.getSystemService("power"))) {
            if (this.mScreenStateListener != null) {
                this.mScreenStateListener.a();
            }
        } else if (this.mScreenStateListener != null) {
            this.mScreenStateListener.b();
        }
    }

    public void stopScreenStateUpdate() {
        try {
            this.mContext.unregisterReceiver(this.mScreenReceiver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void startScreenBroadcastReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        this.mContext.registerReceiver(this.mScreenReceiver, intentFilter);
    }

    private static boolean isScreenOn(PowerManager powerManager) {
        try {
            return ((Boolean) mReflectScreenState.invoke(powerManager, new Object[0])).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }
}
