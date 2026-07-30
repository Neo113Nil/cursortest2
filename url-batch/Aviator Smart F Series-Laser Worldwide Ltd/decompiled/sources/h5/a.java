package h5;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Log;

/* loaded from: classes4.dex */
public class a implements SensorEventListener {
    private static final String TAG = "StepsCounter";
    private final Context context;
    private int initSteps = -1;
    private InterfaceC0353a onStepsChangeListener;
    private SensorManager sensorManager;

    /* renamed from: h5.a$a, reason: collision with other inner class name */
    public interface InterfaceC0353a {
        void onStepsChange(int i8);
    }

    public a(Context context) {
        this.context = context;
    }

    private void addCountStepListener() {
        Sensor defaultSensor = this.sensorManager.getDefaultSensor(19);
        if (defaultSensor != null) {
            Log.d(TAG, "mFifoMaxEventCount=" + defaultSensor.getFifoMaxEventCount());
            this.sensorManager.registerListener(this, defaultSensor, 3);
        }
    }

    public static a create(Context context) {
        if (isSupportStepCountSensor(context)) {
            return new a(context);
        }
        return null;
    }

    public static boolean isSupportStepCountSensor(Context context) {
        return ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(19) != null;
    }

    public void destroy() {
        SensorManager sensorManager = this.sensorManager;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i8) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        int i8 = (int) sensorEvent.values[0];
        int i9 = this.initSteps;
        if (i9 < 0) {
            this.initSteps = i8;
            return;
        }
        int i10 = i8 - i9;
        Log.d(TAG, "phoneTotalSteps=" + i8 + ", totalSteps=" + i10);
        InterfaceC0353a interfaceC0353a = this.onStepsChangeListener;
        if (interfaceC0353a != null) {
            interfaceC0353a.onStepsChange(i10);
        }
    }

    public void setOnStepsChangeListener(InterfaceC0353a interfaceC0353a) {
        this.onStepsChangeListener = interfaceC0353a;
    }

    public void startCount() {
        if (this.sensorManager != null) {
            this.sensorManager = null;
        }
        this.sensorManager = (SensorManager) this.context.getSystemService("sensor");
        addCountStepListener();
    }
}
