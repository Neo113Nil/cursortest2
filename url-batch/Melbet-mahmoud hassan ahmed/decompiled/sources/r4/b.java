package r4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MicrophoneInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.KeyEvent;
import androidx.media.AudioAttributesCompat;
import androidx.media.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m5.j;
import m5.k;
import r4.b;

/* loaded from: classes.dex */
public class b implements k.c {

    /* renamed from: h, reason: collision with root package name */
    private static a f21351h;

    /* renamed from: f, reason: collision with root package name */
    private m5.c f21352f;

    /* renamed from: g, reason: collision with root package name */
    private k f21353g;

    /* JADX INFO: Access modifiers changed from: private */
    static class a {

        /* renamed from: c, reason: collision with root package name */
        private androidx.media.a f21356c;

        /* renamed from: d, reason: collision with root package name */
        private BroadcastReceiver f21357d;

        /* renamed from: e, reason: collision with root package name */
        private Context f21358e;

        /* renamed from: f, reason: collision with root package name */
        private AudioManager f21359f;

        /* renamed from: g, reason: collision with root package name */
        private Object f21360g;

        /* renamed from: a, reason: collision with root package name */
        private final Handler f21354a = new Handler(Looper.getMainLooper());

        /* renamed from: b, reason: collision with root package name */
        private List<b> f21355b = new ArrayList();

        /* renamed from: h, reason: collision with root package name */
        private List<AudioDeviceInfo> f21361h = new ArrayList();

        /* renamed from: r4.b$a$a, reason: collision with other inner class name */
        class C0130a extends AudioDeviceCallback {
            C0130a() {
            }

            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                a.this.v0("onAudioDevicesAdded", a.f0(audioDeviceInfoArr));
            }

            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                a.this.v0("onAudioDevicesRemoved", a.f0(audioDeviceInfoArr));
            }
        }

        /* renamed from: r4.b$a$b, reason: collision with other inner class name */
        class C0131b extends BroadcastReceiver {
            C0131b() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    a.this.v0("onBecomingNoisy", new Object[0]);
                }
            }
        }

        public a(Context context) {
            this.f21358e = context;
            this.f21359f = (AudioManager) context.getSystemService("audio");
            if (Build.VERSION.SDK_INT >= 23) {
                u0();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object A0() {
            return Boolean.valueOf(this.f21359f.isMicrophoneMute());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object B0() {
            return Boolean.valueOf(this.f21359f.isMusicActive());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object C0() {
            return Boolean.valueOf(this.f21359f.isSpeakerphoneOn());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object D0(int i7) {
            b.g(23);
            return Boolean.valueOf(this.f21359f.isStreamMute(i7));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object E0() {
            b.g(21);
            return Boolean.valueOf(this.f21359f.isVolumeFixed());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void F0(int i7) {
            if (i7 == -1) {
                b();
            }
            v0("onAudioFocusChanged", Integer.valueOf(i7));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object G0() {
            this.f21359f.loadSoundEffects();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object H0(int i7, Double d7) {
            if (d7 != null) {
                this.f21359f.playSoundEffect(i7, (float) d7.doubleValue());
                return null;
            }
            this.f21359f.playSoundEffect(i7);
            return null;
        }

        private void I0() {
            if (this.f21357d != null) {
                return;
            }
            C0131b c0131b = new C0131b();
            this.f21357d = c0131b;
            this.f21358e.registerReceiver(c0131b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean K0(List<?> list) {
            if (this.f21356c != null) {
                return true;
            }
            Map map = (Map) list.get(0);
            a.b bVar = new a.b(((Integer) map.get("gainType")).intValue());
            bVar.e(new AudioManager.OnAudioFocusChangeListener() { // from class: r4.a
                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public final void onAudioFocusChange(int i7) {
                    b.a.this.F0(i7);
                }
            });
            if (map.get("audioAttributes") != null) {
                bVar.c(a0((Map) map.get("audioAttributes")));
            }
            if (map.get("willPauseWhenDucked") != null) {
                bVar.g(((Boolean) map.get("willPauseWhenDucked")).booleanValue());
            }
            androidx.media.a a7 = bVar.a();
            this.f21356c = a7;
            boolean z6 = androidx.media.b.b(this.f21359f, a7) == 1;
            if (z6) {
                I0();
            }
            return z6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object L0(int i7) {
            b.g(29);
            this.f21359f.setAllowedCapturePolicy(i7);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object M0(boolean z6) {
            this.f21359f.setBluetoothScoOn(z6);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean N0(Integer num) {
            b.g(31);
            for (AudioDeviceInfo audioDeviceInfo : this.f21361h) {
                if (audioDeviceInfo.getId() == num.intValue()) {
                    return this.f21359f.setCommunicationDevice(audioDeviceInfo);
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object O0(boolean z6) {
            this.f21359f.setMicrophoneMute(z6);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object P0(int i7) {
            this.f21359f.setMode(i7);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object Q0(String str) {
            this.f21359f.setParameters(str);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object R0(int i7) {
            this.f21359f.setRingerMode(i7);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object S0(boolean z6) {
            this.f21359f.setSpeakerphoneOn(z6);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object T0(int i7, int i8, int i9) {
            this.f21359f.setStreamVolume(i7, i8, i9);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object U0() {
            this.f21359f.startBluetoothSco();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object V0() {
            this.f21359f.stopBluetoothSco();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object W(int i7, int i8, int i9) {
            this.f21359f.adjustStreamVolume(i7, i8, i9);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object W0() {
            this.f21359f.unloadSoundEffects();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object X(int i7, int i8, int i9) {
            this.f21359f.adjustSuggestedStreamVolume(i7, i8, i9);
            return null;
        }

        private void X0() {
            Context context;
            BroadcastReceiver broadcastReceiver = this.f21357d;
            if (broadcastReceiver == null || (context = this.f21358e) == null) {
                return;
            }
            context.unregisterReceiver(broadcastReceiver);
            this.f21357d = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object Y(int i7, int i8) {
            this.f21359f.adjustVolume(i7, i8);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object Z() {
            b.g(31);
            this.f21359f.clearCommunicationDevice();
            return null;
        }

        private AudioAttributesCompat a0(Map<?, ?> map) {
            AudioAttributesCompat.a aVar = new AudioAttributesCompat.a();
            if (map.get("contentType") != null) {
                aVar.b(((Integer) map.get("contentType")).intValue());
            }
            if (map.get("flags") != null) {
                aVar.c(((Integer) map.get("flags")).intValue());
            }
            if (map.get("usage") != null) {
                aVar.e(((Integer) map.get("usage")).intValue());
            }
            return aVar.a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean b() {
            if (this.f21358e == null) {
                return false;
            }
            X0();
            androidx.media.a aVar = this.f21356c;
            if (aVar == null) {
                return true;
            }
            int a7 = androidx.media.b.a(this.f21359f, aVar);
            this.f21356c = null;
            return a7 == 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object b0(Map<?, ?> map) {
            b.g(19);
            this.f21359f.dispatchMediaKeyEvent(new KeyEvent(b.d(map.get("downTime")).longValue(), b.d(map.get("eventTime")).longValue(), ((Integer) map.get("action")).intValue(), ((Integer) map.get("code")).intValue(), ((Integer) map.get("repeat")).intValue(), ((Integer) map.get("metaState")).intValue(), ((Integer) map.get("deviceId")).intValue(), ((Integer) map.get("scancode")).intValue(), ((Integer) map.get("flags")).intValue(), ((Integer) map.get("source")).intValue()));
            return null;
        }

        private void d0() {
            this.f21359f.unregisterAudioDeviceCallback((AudioDeviceCallback) this.f21360g);
        }

        private static Map<String, Object> e0(AudioDeviceInfo audioDeviceInfo) {
            return b.f("id", Integer.valueOf(audioDeviceInfo.getId()), "productName", audioDeviceInfo.getProductName(), "address", audioDeviceInfo.getAddress(), "isSource", Boolean.valueOf(audioDeviceInfo.isSource()), "isSink", Boolean.valueOf(audioDeviceInfo.isSink()), "sampleRates", audioDeviceInfo.getSampleRates(), "channelMasks", audioDeviceInfo.getChannelMasks(), "channelIndexMasks", audioDeviceInfo.getChannelIndexMasks(), "channelCounts", audioDeviceInfo.getChannelCounts(), "encodings", audioDeviceInfo.getEncodings(), "type", Integer.valueOf(audioDeviceInfo.getType()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static List<?> f0(AudioDeviceInfo[] audioDeviceInfoArr) {
            ArrayList arrayList = new ArrayList();
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                arrayList.add(e0(audioDeviceInfo));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object g0() {
            b.g(21);
            return Integer.valueOf(this.f21359f.generateAudioSessionId());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object h0() {
            b.g(29);
            return Integer.valueOf(this.f21359f.getAllowedCapturePolicy());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public List<Map<String, Object>> i0() {
            b.g(31);
            this.f21361h = this.f21359f.getAvailableCommunicationDevices();
            ArrayList arrayList = new ArrayList();
            Iterator<AudioDeviceInfo> it = this.f21361h.iterator();
            while (it.hasNext()) {
                arrayList.add(e0(it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, Object> j0() {
            b.g(31);
            return e0(this.f21359f.getCommunicationDevice());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object k0(int i7) {
            b.g(23);
            ArrayList arrayList = new ArrayList();
            for (AudioDeviceInfo audioDeviceInfo : this.f21359f.getDevices(i7)) {
                String str = null;
                if (Build.VERSION.SDK_INT >= 28) {
                    str = audioDeviceInfo.getAddress();
                }
                arrayList.add(b.f("id", Integer.valueOf(audioDeviceInfo.getId()), "productName", audioDeviceInfo.getProductName(), "address", str, "isSource", Boolean.valueOf(audioDeviceInfo.isSource()), "isSink", Boolean.valueOf(audioDeviceInfo.isSink()), "sampleRates", b.e(audioDeviceInfo.getSampleRates()), "channelMasks", b.e(audioDeviceInfo.getChannelMasks()), "channelIndexMasks", b.e(audioDeviceInfo.getChannelIndexMasks()), "channelCounts", b.e(audioDeviceInfo.getChannelCounts()), "encodings", b.e(audioDeviceInfo.getEncodings()), "type", Integer.valueOf(audioDeviceInfo.getType())));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object l0() {
            b.g(28);
            ArrayList arrayList = new ArrayList();
            for (MicrophoneInfo microphoneInfo : this.f21359f.getMicrophones()) {
                ArrayList arrayList2 = new ArrayList();
                for (Pair<Float, Float> pair : microphoneInfo.getFrequencyResponse()) {
                    arrayList2.add(new ArrayList(Arrays.asList(Double.valueOf(((Float) pair.first).floatValue()), Double.valueOf(((Float) pair.second).floatValue()))));
                }
                ArrayList arrayList3 = new ArrayList();
                for (Pair<Integer, Integer> pair2 : microphoneInfo.getChannelMapping()) {
                    arrayList3.add(new ArrayList(Arrays.asList((Integer) pair2.first, (Integer) pair2.second)));
                }
                arrayList.add(b.f("description", microphoneInfo.getDescription(), "id", Integer.valueOf(microphoneInfo.getId()), "type", Integer.valueOf(microphoneInfo.getType()), "address", microphoneInfo.getAddress(), "location", Integer.valueOf(microphoneInfo.getLocation()), "group", Integer.valueOf(microphoneInfo.getGroup()), "indexInTheGroup", Integer.valueOf(microphoneInfo.getIndexInTheGroup()), "position", b.b(microphoneInfo.getPosition()), "orientation", b.b(microphoneInfo.getOrientation()), "frequencyResponse", arrayList2, "channelMapping", arrayList3, "sensitivity", Float.valueOf(microphoneInfo.getSensitivity()), "maxSpl", Float.valueOf(microphoneInfo.getMaxSpl()), "minSpl", Float.valueOf(microphoneInfo.getMinSpl()), "directionality", Integer.valueOf(microphoneInfo.getDirectionality())));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object m0() {
            return Integer.valueOf(this.f21359f.getMode());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object n0(String str) {
            return this.f21359f.getParameters(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object o0(String str) {
            b.g(17);
            return this.f21359f.getProperty(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object p0() {
            return Integer.valueOf(this.f21359f.getRingerMode());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object q0(int i7) {
            return Integer.valueOf(this.f21359f.getStreamMaxVolume(i7));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object r0(int i7) {
            b.g(28);
            return Integer.valueOf(this.f21359f.getStreamMinVolume(i7));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object s0(int i7) {
            return Integer.valueOf(this.f21359f.getStreamVolume(i7));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object t0(int i7, int i8, int i9) {
            b.g(28);
            return Float.valueOf(this.f21359f.getStreamVolumeDb(i7, i8, i9));
        }

        private void u0() {
            C0130a c0130a = new C0130a();
            this.f21360g = c0130a;
            this.f21359f.registerAudioDeviceCallback(c0130a, this.f21354a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void v0(String str, Object... objArr) {
            for (b bVar : this.f21355b) {
                bVar.f21353g.c(str, new ArrayList(Arrays.asList(objArr)));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object w0() {
            return Boolean.valueOf(this.f21359f.isBluetoothScoAvailableOffCall());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object x0() {
            return Boolean.valueOf(this.f21359f.isBluetoothScoOn());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object z0() {
            b.g(29);
            return Boolean.valueOf(AudioManager.isHapticPlaybackSupported());
        }

        public void J0(b bVar) {
            this.f21355b.remove(bVar);
        }

        public void V(b bVar) {
            this.f21355b.add(bVar);
        }

        public void c0() {
            b();
            if (Build.VERSION.SDK_INT >= 23) {
                d0();
            }
            this.f21358e = null;
            this.f21359f = null;
        }

        public boolean y0() {
            return this.f21355b.size() == 0;
        }
    }

    public b(Context context, m5.c cVar) {
        if (f21351h == null) {
            f21351h = new a(context);
        }
        this.f21352f = cVar;
        this.f21353g = new k(cVar, "com.ryanheise.android_audio_manager");
        f21351h.V(this);
        this.f21353g.e(this);
    }

    static ArrayList<Double> b(MicrophoneInfo.Coordinate3F coordinate3F) {
        ArrayList<Double> arrayList = new ArrayList<>();
        arrayList.add(Double.valueOf(coordinate3F.x));
        arrayList.add(Double.valueOf(coordinate3F.y));
        arrayList.add(Double.valueOf(coordinate3F.z));
        return arrayList;
    }

    static Long d(Object obj) {
        return (obj == null || (obj instanceof Long)) ? (Long) obj : Long.valueOf(((Integer) obj).intValue());
    }

    static ArrayList<Integer> e(int[] iArr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i7 : iArr) {
            arrayList.add(Integer.valueOf(i7));
        }
        return arrayList;
    }

    static Map<String, Object> f(Object... objArr) {
        HashMap hashMap = new HashMap();
        for (int i7 = 0; i7 < objArr.length; i7 += 2) {
            hashMap.put((String) objArr[i7], objArr[i7 + 1]);
        }
        return hashMap;
    }

    static void g(int i7) {
        if (Build.VERSION.SDK_INT >= i7) {
            return;
        }
        throw new RuntimeException("Requires API level " + i7);
    }

    @Override // m5.k.c
    public void C(j jVar, k.d dVar) {
        List list;
        Object valueOf;
        try {
            list = (List) jVar.f19248b;
            switch (jVar.f19247a) {
                case "requestAudioFocus":
                    valueOf = Boolean.valueOf(f21351h.K0(list));
                    break;
                case "abandonAudioFocus":
                    valueOf = Boolean.valueOf(f21351h.b());
                    break;
                case "dispatchMediaKeyEvent":
                    valueOf = f21351h.b0((Map) list.get(0));
                    break;
                case "isVolumeFixed":
                    valueOf = f21351h.E0();
                    break;
                case "adjustStreamVolume":
                    valueOf = f21351h.W(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue(), ((Integer) list.get(2)).intValue());
                    break;
                case "adjustVolume":
                    valueOf = f21351h.Y(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue());
                    break;
                case "adjustSuggestedStreamVolume":
                    valueOf = f21351h.X(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue(), ((Integer) list.get(2)).intValue());
                    break;
                case "getRingerMode":
                    valueOf = f21351h.p0();
                    break;
                case "getStreamMaxVolume":
                    valueOf = f21351h.q0(((Integer) list.get(0)).intValue());
                    break;
                case "getStreamMinVolume":
                    valueOf = f21351h.r0(((Integer) list.get(0)).intValue());
                    break;
                case "getStreamVolume":
                    valueOf = f21351h.s0(((Integer) list.get(0)).intValue());
                    break;
                case "getStreamVolumeDb":
                    valueOf = f21351h.t0(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue(), ((Integer) list.get(2)).intValue());
                    break;
                case "setRingerMode":
                    valueOf = f21351h.R0(((Integer) list.get(0)).intValue());
                    break;
                case "setStreamVolume":
                    valueOf = f21351h.T0(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue(), ((Integer) list.get(2)).intValue());
                    break;
                case "isStreamMute":
                    valueOf = f21351h.D0(((Integer) list.get(0)).intValue());
                    break;
                case "getAvailableCommunicationDevices":
                    valueOf = f21351h.i0();
                    break;
                case "setCommunicationDevice":
                    valueOf = Boolean.valueOf(f21351h.N0((Integer) list.get(0)));
                    break;
                case "getCommunicationDevice":
                    valueOf = f21351h.j0();
                    break;
                case "clearCommunicationDevice":
                    valueOf = f21351h.Z();
                    break;
                case "setSpeakerphoneOn":
                    valueOf = f21351h.S0(((Boolean) list.get(0)).booleanValue());
                    break;
                case "isSpeakerphoneOn":
                    valueOf = f21351h.C0();
                    break;
                case "setAllowedCapturePolicy":
                    valueOf = f21351h.L0(((Integer) list.get(0)).intValue());
                    break;
                case "getAllowedCapturePolicy":
                    valueOf = f21351h.h0();
                    break;
                case "isBluetoothScoAvailableOffCall":
                    valueOf = f21351h.w0();
                    break;
                case "startBluetoothSco":
                    valueOf = f21351h.U0();
                    break;
                case "stopBluetoothSco":
                    valueOf = f21351h.V0();
                    break;
                case "setBluetoothScoOn":
                    valueOf = f21351h.M0(((Boolean) list.get(0)).booleanValue());
                    break;
                case "isBluetoothScoOn":
                    valueOf = f21351h.x0();
                    break;
                case "setMicrophoneMute":
                    valueOf = f21351h.O0(((Boolean) list.get(0)).booleanValue());
                    break;
                case "isMicrophoneMute":
                    valueOf = f21351h.A0();
                    break;
                case "setMode":
                    valueOf = f21351h.P0(((Integer) list.get(0)).intValue());
                    break;
                case "getMode":
                    valueOf = f21351h.m0();
                    break;
                case "isMusicActive":
                    valueOf = f21351h.B0();
                    break;
                case "generateAudioSessionId":
                    valueOf = f21351h.g0();
                    break;
                case "setParameters":
                    valueOf = f21351h.Q0((String) list.get(0));
                    break;
                case "getParameters":
                    valueOf = f21351h.n0((String) list.get(0));
                    break;
                case "playSoundEffect":
                    valueOf = f21351h.H0(((Integer) list.get(0)).intValue(), (Double) list.get(1));
                    break;
                case "loadSoundEffects":
                    valueOf = f21351h.G0();
                    break;
                case "unloadSoundEffects":
                    valueOf = f21351h.W0();
                    break;
                case "getProperty":
                    valueOf = f21351h.o0((String) list.get(0));
                    break;
                case "getDevices":
                    valueOf = f21351h.k0(((Integer) list.get(0)).intValue());
                    break;
                case "getMicrophones":
                    valueOf = f21351h.l0();
                    break;
                case "isHapticPlaybackSupported":
                    valueOf = f21351h.z0();
                    break;
                default:
                    dVar.c();
                    return;
            }
            dVar.a(valueOf);
        } catch (Exception e7) {
            e7.printStackTrace();
            dVar.b("Error: " + e7, null, null);
        }
    }

    public void c() {
        this.f21353g.e(null);
        f21351h.J0(this);
        if (f21351h.y0()) {
            f21351h.c0();
            f21351h = null;
        }
        this.f21353g = null;
        this.f21352f = null;
    }
}
