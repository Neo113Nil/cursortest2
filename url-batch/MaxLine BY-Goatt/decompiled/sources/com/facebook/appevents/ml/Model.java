package com.facebook.appevents.ml;

import com.facebook.appevents.ml.ModelManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import defpackage.lh;
import defpackage.mi1;
import defpackage.oi;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class Model {
    private static final int SEQ_LEN = 128;
    private final MTensor convs0Bias;
    private final MTensor convs0Weight;
    private final MTensor convs1Bias;
    private final MTensor convs1Weight;
    private final MTensor convs2Bias;
    private final MTensor convs2Weight;
    private final MTensor embedding;
    private final MTensor fc1Bias;
    private final MTensor fc1Weight;
    private final MTensor fc2Bias;
    private final MTensor fc2Weight;
    private final Map<String, MTensor> finalWeights;
    public static final Companion Companion = new Companion(null);
    private static final Map<String, String> mapping = mi1.e(new Pair("embedding.weight", "embed.weight"), new Pair("dense1.weight", "fc1.weight"), new Pair("dense2.weight", "fc2.weight"), new Pair("dense3.weight", "fc3.weight"), new Pair("dense1.bias", "fc1.bias"), new Pair("dense2.bias", "fc2.bias"), new Pair("dense3.bias", "fc3.bias"));

    private Model(Map<String, MTensor> map) {
        MTensor mTensor = map.get("embed.weight");
        if (mTensor == null) {
            lh.g("Required value was null.");
            throw null;
        }
        this.embedding = mTensor;
        MTensor mTensor2 = map.get("convs.0.weight");
        if (mTensor2 == null) {
            lh.g("Required value was null.");
            throw null;
        }
        this.convs0Weight = Operator.transpose3D(mTensor2);
        MTensor mTensor3 = map.get("convs.1.weight");
        if (mTensor3 == null) {
            lh.g("Required value was null.");
            throw null;
        }
        this.convs1Weight = Operator.transpose3D(mTensor3);
        MTensor mTensor4 = map.get("convs.2.weight");
        if (mTensor4 == null) {
            lh.g("Required value was null.");
            throw null;
        }
        this.convs2Weight = Operator.transpose3D(mTensor4);
        MTensor mTensor5 = map.get("convs.0.bias");
        if (mTensor5 == null) {
            lh.g("Required value was null.");
            throw null;
        }
        this.convs0Bias = mTensor5;
        MTensor mTensor6 = map.get("convs.1.bias");
        if (mTensor6 == null) {
            lh.g("Required value was null.");
            throw null;
        }
        this.convs1Bias = mTensor6;
        MTensor mTensor7 = map.get("convs.2.bias");
        if (mTensor7 == null) {
            lh.g("Required value was null.");
            throw null;
        }
        this.convs2Bias = mTensor7;
        MTensor mTensor8 = map.get("fc1.weight");
        if (mTensor8 == null) {
            lh.g("Required value was null.");
            throw null;
        }
        this.fc1Weight = Operator.transpose2D(mTensor8);
        MTensor mTensor9 = map.get("fc2.weight");
        if (mTensor9 == null) {
            lh.g("Required value was null.");
            throw null;
        }
        this.fc2Weight = Operator.transpose2D(mTensor9);
        MTensor mTensor10 = map.get("fc1.bias");
        if (mTensor10 == null) {
            lh.g("Required value was null.");
            throw null;
        }
        this.fc1Bias = mTensor10;
        MTensor mTensor11 = map.get("fc2.bias");
        if (mTensor11 == null) {
            lh.g("Required value was null.");
            throw null;
        }
        this.fc2Bias = mTensor11;
        this.finalWeights = new HashMap();
        for (String str : oi.z(new String[]{ModelManager.Task.MTML_INTEGRITY_DETECT.toKey(), ModelManager.Task.MTML_APP_EVENT_PREDICTION.toKey()})) {
            String str2 = str + ".weight";
            String str3 = str + ".bias";
            MTensor mTensor12 = map.get(str2);
            MTensor mTensor13 = map.get(str3);
            if (mTensor12 != null) {
                this.finalWeights.put(str2, Operator.transpose2D(mTensor12));
            }
            if (mTensor13 != null) {
                this.finalWeights.put(str3, mTensor13);
            }
        }
    }

    public static final /* synthetic */ Map access$getMapping$cp() {
        if (CrashShieldHandler.isObjectCrashing(Model.class)) {
            return null;
        }
        try {
            return mapping;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Model.class);
            return null;
        }
    }

    public final MTensor predictOnMTML(MTensor mTensor, String[] strArr, String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            mTensor.getClass();
            strArr.getClass();
            str.getClass();
            MTensor conv1D = Operator.conv1D(Operator.embedding(strArr, SEQ_LEN, this.embedding), this.convs0Weight);
            Operator.addmv(conv1D, this.convs0Bias);
            Operator.relu(conv1D);
            MTensor conv1D2 = Operator.conv1D(conv1D, this.convs1Weight);
            Operator.addmv(conv1D2, this.convs1Bias);
            Operator.relu(conv1D2);
            MTensor maxPool1D = Operator.maxPool1D(conv1D2, 2);
            MTensor conv1D3 = Operator.conv1D(maxPool1D, this.convs2Weight);
            Operator.addmv(conv1D3, this.convs2Bias);
            Operator.relu(conv1D3);
            MTensor maxPool1D2 = Operator.maxPool1D(conv1D, conv1D.getShape(1));
            MTensor maxPool1D3 = Operator.maxPool1D(maxPool1D, maxPool1D.getShape(1));
            MTensor maxPool1D4 = Operator.maxPool1D(conv1D3, conv1D3.getShape(1));
            Operator.flatten(maxPool1D2, 1);
            Operator.flatten(maxPool1D3, 1);
            Operator.flatten(maxPool1D4, 1);
            MTensor dense = Operator.dense(Operator.concatenate(new MTensor[]{maxPool1D2, maxPool1D3, maxPool1D4, mTensor}), this.fc1Weight, this.fc1Bias);
            Operator.relu(dense);
            MTensor dense2 = Operator.dense(dense, this.fc2Weight, this.fc2Bias);
            Operator.relu(dense2);
            MTensor mTensor2 = this.finalWeights.get(str + ".weight");
            MTensor mTensor3 = this.finalWeights.get(str + ".bias");
            if (mTensor2 != null && mTensor3 != null) {
                MTensor dense3 = Operator.dense(dense2, mTensor2, mTensor3);
                Operator.softmax(dense3);
                return dense3;
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Map<String, MTensor> parse(File file) {
            Map<String, MTensor> parseModelWeights = Utils.parseModelWeights(file);
            if (parseModelWeights == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            Map access$getMapping$cp = Model.access$getMapping$cp();
            for (Map.Entry<String, MTensor> entry : parseModelWeights.entrySet()) {
                String key = entry.getKey();
                if (access$getMapping$cp.containsKey(entry.getKey()) && (key = (String) access$getMapping$cp.get(entry.getKey())) == null) {
                    return null;
                }
                hashMap.put(key, entry.getValue());
            }
            return hashMap;
        }

        public final Model build(File file) {
            file.getClass();
            Map<String, MTensor> parse = parse(file);
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (parse == null) {
                return null;
            }
            try {
                return new Model(parse, defaultConstructorMarker);
            } catch (Exception unused) {
                return null;
            }
        }

        private Companion() {
        }
    }

    public /* synthetic */ Model(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }
}
