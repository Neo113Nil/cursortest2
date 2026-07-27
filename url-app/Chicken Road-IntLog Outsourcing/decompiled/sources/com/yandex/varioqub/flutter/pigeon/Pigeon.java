package com.yandex.varioqub.flutter.pigeon;

import H2.b;
import H2.c;
import H2.f;
import H2.k;
import H2.r;
import android.util.Log;
import com.yandex.varioqub.flutter.pigeon.Pigeon;
import f2.t;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class Pigeon {

    public static final class FetchStatus {
        private String error;
        private Long status;

        public static final class Builder {
            private String error;
            private Long status;

            public FetchStatus build() {
                FetchStatus fetchStatus = new FetchStatus();
                fetchStatus.setError(this.error);
                fetchStatus.setStatus(this.status);
                return fetchStatus;
            }

            public Builder setError(String str) {
                this.error = str;
                return this;
            }

            public Builder setStatus(Long l2) {
                this.status = l2;
                return this;
            }
        }

        public static FetchStatus fromList(ArrayList<Object> arrayList) {
            Long valueOf;
            FetchStatus fetchStatus = new FetchStatus();
            fetchStatus.setError((String) arrayList.get(0));
            Object obj = arrayList.get(1);
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            fetchStatus.setStatus(valueOf);
            return fetchStatus;
        }

        public String getError() {
            return this.error;
        }

        public Long getStatus() {
            return this.status;
        }

        public void setError(String str) {
            this.error = str;
        }

        public void setStatus(Long l2) {
            this.status = l2;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.error);
            arrayList.add(this.status);
            return arrayList;
        }
    }

    public static class FlutterError extends RuntimeException {
        public final String code;
        public final Object details;

        public FlutterError(String str, String str2, Object obj) {
            super(str2);
            this.code = str;
            this.details = obj;
        }
    }

    public interface Result<T> {
        void error(Throwable th);

        void success(T t5);
    }

    public interface VarioqubPigeon {
        static k getCodec() {
            return VarioqubPigeonCodec.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(VarioqubPigeon varioqubPigeon, Object obj, c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                varioqubPigeon.initVarioqubWithAppMetricaAdapter((VarioqubSettingsPigeon) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.b(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$1(VarioqubPigeon varioqubPigeon, Object obj, final c cVar) {
            final ArrayList arrayList = new ArrayList();
            varioqubPigeon.fetchConfig(new Result<FetchStatus>() { // from class: com.yandex.varioqub.flutter.pigeon.Pigeon.VarioqubPigeon.1
                @Override // com.yandex.varioqub.flutter.pigeon.Pigeon.Result
                public void error(Throwable th) {
                    cVar.b(Pigeon.wrapError(th));
                }

                @Override // com.yandex.varioqub.flutter.pigeon.Pigeon.Result
                public void success(FetchStatus fetchStatus) {
                    arrayList.add(0, fetchStatus);
                    cVar.b(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$10(VarioqubPigeon varioqubPigeon, Object obj, c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, varioqubPigeon.getAllKeys());
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.b(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$11(VarioqubPigeon varioqubPigeon, Object obj, c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                varioqubPigeon.setDefaults((Map) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.b(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$2(VarioqubPigeon varioqubPigeon, Object obj, c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                varioqubPigeon.activateConfig();
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.b(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$3(VarioqubPigeon varioqubPigeon, Object obj, c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, varioqubPigeon.getString((String) arrayList2.get(0), (String) arrayList2.get(1)));
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.b(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$4(VarioqubPigeon varioqubPigeon, Object obj, c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, varioqubPigeon.getBoolean((String) arrayList2.get(0), (Boolean) arrayList2.get(1)));
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.b(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$5(VarioqubPigeon varioqubPigeon, Object obj, c cVar) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            String str = (String) arrayList2.get(0);
            Number number = (Number) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th) {
                    arrayList = Pigeon.wrapError(th);
                }
            }
            arrayList.add(0, varioqubPigeon.getInt(str, valueOf));
            cVar.b(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$6(VarioqubPigeon varioqubPigeon, Object obj, c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, varioqubPigeon.getDouble((String) arrayList2.get(0), (Double) arrayList2.get(1)));
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.b(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$7(VarioqubPigeon varioqubPigeon, Object obj, c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, varioqubPigeon.getId());
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.b(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$8(VarioqubPigeon varioqubPigeon, Object obj, c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                varioqubPigeon.putClientFeature((String) arrayList2.get(0), (String) arrayList2.get(1));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.b(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$9(VarioqubPigeon varioqubPigeon, Object obj, c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                varioqubPigeon.clearClientFeatures();
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.b(arrayList);
        }

        static void setup(f fVar, final VarioqubPigeon varioqubPigeon) {
            t tVar = new t(fVar, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.initVarioqubWithAppMetricaAdapter", getCodec(), null);
            if (varioqubPigeon != null) {
                final int i2 = 0;
                tVar.h(new b(varioqubPigeon) { // from class: com.yandex.varioqub.flutter.pigeon.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.VarioqubPigeon f5472b;

                    {
                        this.f5472b = varioqubPigeon;
                    }

                    @Override // H2.b
                    public final void c(Object obj, B0.t tVar2) {
                        switch (i2) {
                            case 0:
                                Pigeon.VarioqubPigeon.lambda$setup$0(this.f5472b, obj, tVar2);
                                break;
                            case 1:
                                Pigeon.VarioqubPigeon.lambda$setup$8(this.f5472b, obj, tVar2);
                                break;
                            case 2:
                                Pigeon.VarioqubPigeon.lambda$setup$9(this.f5472b, obj, tVar2);
                                break;
                            case 3:
                                Pigeon.VarioqubPigeon.lambda$setup$10(this.f5472b, obj, tVar2);
                                break;
                            case 4:
                                Pigeon.VarioqubPigeon.lambda$setup$11(this.f5472b, obj, tVar2);
                                break;
                            case 5:
                                Pigeon.VarioqubPigeon.lambda$setup$1(this.f5472b, obj, tVar2);
                                break;
                            case 6:
                                Pigeon.VarioqubPigeon.lambda$setup$2(this.f5472b, obj, tVar2);
                                break;
                            case 7:
                                Pigeon.VarioqubPigeon.lambda$setup$3(this.f5472b, obj, tVar2);
                                break;
                            case 8:
                                Pigeon.VarioqubPigeon.lambda$setup$4(this.f5472b, obj, tVar2);
                                break;
                            case 9:
                                Pigeon.VarioqubPigeon.lambda$setup$5(this.f5472b, obj, tVar2);
                                break;
                            case 10:
                                Pigeon.VarioqubPigeon.lambda$setup$6(this.f5472b, obj, tVar2);
                                break;
                            default:
                                Pigeon.VarioqubPigeon.lambda$setup$7(this.f5472b, obj, tVar2);
                                break;
                        }
                    }
                });
            } else {
                tVar.h(null);
            }
            t tVar2 = new t(fVar, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.fetchConfig", getCodec(), null);
            if (varioqubPigeon != null) {
                final int i3 = 5;
                tVar2.h(new b(varioqubPigeon) { // from class: com.yandex.varioqub.flutter.pigeon.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.VarioqubPigeon f5472b;

                    {
                        this.f5472b = varioqubPigeon;
                    }

                    @Override // H2.b
                    public final void c(Object obj, B0.t tVar22) {
                        switch (i3) {
                            case 0:
                                Pigeon.VarioqubPigeon.lambda$setup$0(this.f5472b, obj, tVar22);
                                break;
                            case 1:
                                Pigeon.VarioqubPigeon.lambda$setup$8(this.f5472b, obj, tVar22);
                                break;
                            case 2:
                                Pigeon.VarioqubPigeon.lambda$setup$9(this.f5472b, obj, tVar22);
                                break;
                            case 3:
                                Pigeon.VarioqubPigeon.lambda$setup$10(this.f5472b, obj, tVar22);
                                break;
                            case 4:
                                Pigeon.VarioqubPigeon.lambda$setup$11(this.f5472b, obj, tVar22);
                                break;
                            case 5:
                                Pigeon.VarioqubPigeon.lambda$setup$1(this.f5472b, obj, tVar22);
                                break;
                            case 6:
                                Pigeon.VarioqubPigeon.lambda$setup$2(this.f5472b, obj, tVar22);
                                break;
                            case 7:
                                Pigeon.VarioqubPigeon.lambda$setup$3(this.f5472b, obj, tVar22);
                                break;
                            case 8:
                                Pigeon.VarioqubPigeon.lambda$setup$4(this.f5472b, obj, tVar22);
                                break;
                            case 9:
                                Pigeon.VarioqubPigeon.lambda$setup$5(this.f5472b, obj, tVar22);
                                break;
                            case 10:
                                Pigeon.VarioqubPigeon.lambda$setup$6(this.f5472b, obj, tVar22);
                                break;
                            default:
                                Pigeon.VarioqubPigeon.lambda$setup$7(this.f5472b, obj, tVar22);
                                break;
                        }
                    }
                });
            } else {
                tVar2.h(null);
            }
            t tVar3 = new t(fVar, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.activateConfig", getCodec(), null);
            if (varioqubPigeon != null) {
                final int i6 = 6;
                tVar3.h(new b(varioqubPigeon) { // from class: com.yandex.varioqub.flutter.pigeon.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.VarioqubPigeon f5472b;

                    {
                        this.f5472b = varioqubPigeon;
                    }

                    @Override // H2.b
                    public final void c(Object obj, B0.t tVar22) {
                        switch (i6) {
                            case 0:
                                Pigeon.VarioqubPigeon.lambda$setup$0(this.f5472b, obj, tVar22);
                                break;
                            case 1:
                                Pigeon.VarioqubPigeon.lambda$setup$8(this.f5472b, obj, tVar22);
                                break;
                            case 2:
                                Pigeon.VarioqubPigeon.lambda$setup$9(this.f5472b, obj, tVar22);
                                break;
                            case 3:
                                Pigeon.VarioqubPigeon.lambda$setup$10(this.f5472b, obj, tVar22);
                                break;
                            case 4:
                                Pigeon.VarioqubPigeon.lambda$setup$11(this.f5472b, obj, tVar22);
                                break;
                            case 5:
                                Pigeon.VarioqubPigeon.lambda$setup$1(this.f5472b, obj, tVar22);
                                break;
                            case 6:
                                Pigeon.VarioqubPigeon.lambda$setup$2(this.f5472b, obj, tVar22);
                                break;
                            case 7:
                                Pigeon.VarioqubPigeon.lambda$setup$3(this.f5472b, obj, tVar22);
                                break;
                            case 8:
                                Pigeon.VarioqubPigeon.lambda$setup$4(this.f5472b, obj, tVar22);
                                break;
                            case 9:
                                Pigeon.VarioqubPigeon.lambda$setup$5(this.f5472b, obj, tVar22);
                                break;
                            case 10:
                                Pigeon.VarioqubPigeon.lambda$setup$6(this.f5472b, obj, tVar22);
                                break;
                            default:
                                Pigeon.VarioqubPigeon.lambda$setup$7(this.f5472b, obj, tVar22);
                                break;
                        }
                    }
                });
            } else {
                tVar3.h(null);
            }
            t tVar4 = new t(fVar, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.getString", getCodec(), null);
            if (varioqubPigeon != null) {
                final int i7 = 7;
                tVar4.h(new b(varioqubPigeon) { // from class: com.yandex.varioqub.flutter.pigeon.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.VarioqubPigeon f5472b;

                    {
                        this.f5472b = varioqubPigeon;
                    }

                    @Override // H2.b
                    public final void c(Object obj, B0.t tVar22) {
                        switch (i7) {
                            case 0:
                                Pigeon.VarioqubPigeon.lambda$setup$0(this.f5472b, obj, tVar22);
                                break;
                            case 1:
                                Pigeon.VarioqubPigeon.lambda$setup$8(this.f5472b, obj, tVar22);
                                break;
                            case 2:
                                Pigeon.VarioqubPigeon.lambda$setup$9(this.f5472b, obj, tVar22);
                                break;
                            case 3:
                                Pigeon.VarioqubPigeon.lambda$setup$10(this.f5472b, obj, tVar22);
                                break;
                            case 4:
                                Pigeon.VarioqubPigeon.lambda$setup$11(this.f5472b, obj, tVar22);
                                break;
                            case 5:
                                Pigeon.VarioqubPigeon.lambda$setup$1(this.f5472b, obj, tVar22);
                                break;
                            case 6:
                                Pigeon.VarioqubPigeon.lambda$setup$2(this.f5472b, obj, tVar22);
                                break;
                            case 7:
                                Pigeon.VarioqubPigeon.lambda$setup$3(this.f5472b, obj, tVar22);
                                break;
                            case 8:
                                Pigeon.VarioqubPigeon.lambda$setup$4(this.f5472b, obj, tVar22);
                                break;
                            case 9:
                                Pigeon.VarioqubPigeon.lambda$setup$5(this.f5472b, obj, tVar22);
                                break;
                            case 10:
                                Pigeon.VarioqubPigeon.lambda$setup$6(this.f5472b, obj, tVar22);
                                break;
                            default:
                                Pigeon.VarioqubPigeon.lambda$setup$7(this.f5472b, obj, tVar22);
                                break;
                        }
                    }
                });
            } else {
                tVar4.h(null);
            }
            t tVar5 = new t(fVar, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.getBoolean", getCodec(), null);
            if (varioqubPigeon != null) {
                final int i8 = 8;
                tVar5.h(new b(varioqubPigeon) { // from class: com.yandex.varioqub.flutter.pigeon.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.VarioqubPigeon f5472b;

                    {
                        this.f5472b = varioqubPigeon;
                    }

                    @Override // H2.b
                    public final void c(Object obj, B0.t tVar22) {
                        switch (i8) {
                            case 0:
                                Pigeon.VarioqubPigeon.lambda$setup$0(this.f5472b, obj, tVar22);
                                break;
                            case 1:
                                Pigeon.VarioqubPigeon.lambda$setup$8(this.f5472b, obj, tVar22);
                                break;
                            case 2:
                                Pigeon.VarioqubPigeon.lambda$setup$9(this.f5472b, obj, tVar22);
                                break;
                            case 3:
                                Pigeon.VarioqubPigeon.lambda$setup$10(this.f5472b, obj, tVar22);
                                break;
                            case 4:
                                Pigeon.VarioqubPigeon.lambda$setup$11(this.f5472b, obj, tVar22);
                                break;
                            case 5:
                                Pigeon.VarioqubPigeon.lambda$setup$1(this.f5472b, obj, tVar22);
                                break;
                            case 6:
                                Pigeon.VarioqubPigeon.lambda$setup$2(this.f5472b, obj, tVar22);
                                break;
                            case 7:
                                Pigeon.VarioqubPigeon.lambda$setup$3(this.f5472b, obj, tVar22);
                                break;
                            case 8:
                                Pigeon.VarioqubPigeon.lambda$setup$4(this.f5472b, obj, tVar22);
                                break;
                            case 9:
                                Pigeon.VarioqubPigeon.lambda$setup$5(this.f5472b, obj, tVar22);
                                break;
                            case 10:
                                Pigeon.VarioqubPigeon.lambda$setup$6(this.f5472b, obj, tVar22);
                                break;
                            default:
                                Pigeon.VarioqubPigeon.lambda$setup$7(this.f5472b, obj, tVar22);
                                break;
                        }
                    }
                });
            } else {
                tVar5.h(null);
            }
            t tVar6 = new t(fVar, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.getInt", getCodec(), null);
            if (varioqubPigeon != null) {
                final int i9 = 9;
                tVar6.h(new b(varioqubPigeon) { // from class: com.yandex.varioqub.flutter.pigeon.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.VarioqubPigeon f5472b;

                    {
                        this.f5472b = varioqubPigeon;
                    }

                    @Override // H2.b
                    public final void c(Object obj, B0.t tVar22) {
                        switch (i9) {
                            case 0:
                                Pigeon.VarioqubPigeon.lambda$setup$0(this.f5472b, obj, tVar22);
                                break;
                            case 1:
                                Pigeon.VarioqubPigeon.lambda$setup$8(this.f5472b, obj, tVar22);
                                break;
                            case 2:
                                Pigeon.VarioqubPigeon.lambda$setup$9(this.f5472b, obj, tVar22);
                                break;
                            case 3:
                                Pigeon.VarioqubPigeon.lambda$setup$10(this.f5472b, obj, tVar22);
                                break;
                            case 4:
                                Pigeon.VarioqubPigeon.lambda$setup$11(this.f5472b, obj, tVar22);
                                break;
                            case 5:
                                Pigeon.VarioqubPigeon.lambda$setup$1(this.f5472b, obj, tVar22);
                                break;
                            case 6:
                                Pigeon.VarioqubPigeon.lambda$setup$2(this.f5472b, obj, tVar22);
                                break;
                            case 7:
                                Pigeon.VarioqubPigeon.lambda$setup$3(this.f5472b, obj, tVar22);
                                break;
                            case 8:
                                Pigeon.VarioqubPigeon.lambda$setup$4(this.f5472b, obj, tVar22);
                                break;
                            case 9:
                                Pigeon.VarioqubPigeon.lambda$setup$5(this.f5472b, obj, tVar22);
                                break;
                            case 10:
                                Pigeon.VarioqubPigeon.lambda$setup$6(this.f5472b, obj, tVar22);
                                break;
                            default:
                                Pigeon.VarioqubPigeon.lambda$setup$7(this.f5472b, obj, tVar22);
                                break;
                        }
                    }
                });
            } else {
                tVar6.h(null);
            }
            t tVar7 = new t(fVar, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.getDouble", getCodec(), null);
            if (varioqubPigeon != null) {
                final int i10 = 10;
                tVar7.h(new b(varioqubPigeon) { // from class: com.yandex.varioqub.flutter.pigeon.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.VarioqubPigeon f5472b;

                    {
                        this.f5472b = varioqubPigeon;
                    }

                    @Override // H2.b
                    public final void c(Object obj, B0.t tVar22) {
                        switch (i10) {
                            case 0:
                                Pigeon.VarioqubPigeon.lambda$setup$0(this.f5472b, obj, tVar22);
                                break;
                            case 1:
                                Pigeon.VarioqubPigeon.lambda$setup$8(this.f5472b, obj, tVar22);
                                break;
                            case 2:
                                Pigeon.VarioqubPigeon.lambda$setup$9(this.f5472b, obj, tVar22);
                                break;
                            case 3:
                                Pigeon.VarioqubPigeon.lambda$setup$10(this.f5472b, obj, tVar22);
                                break;
                            case 4:
                                Pigeon.VarioqubPigeon.lambda$setup$11(this.f5472b, obj, tVar22);
                                break;
                            case 5:
                                Pigeon.VarioqubPigeon.lambda$setup$1(this.f5472b, obj, tVar22);
                                break;
                            case 6:
                                Pigeon.VarioqubPigeon.lambda$setup$2(this.f5472b, obj, tVar22);
                                break;
                            case 7:
                                Pigeon.VarioqubPigeon.lambda$setup$3(this.f5472b, obj, tVar22);
                                break;
                            case 8:
                                Pigeon.VarioqubPigeon.lambda$setup$4(this.f5472b, obj, tVar22);
                                break;
                            case 9:
                                Pigeon.VarioqubPigeon.lambda$setup$5(this.f5472b, obj, tVar22);
                                break;
                            case 10:
                                Pigeon.VarioqubPigeon.lambda$setup$6(this.f5472b, obj, tVar22);
                                break;
                            default:
                                Pigeon.VarioqubPigeon.lambda$setup$7(this.f5472b, obj, tVar22);
                                break;
                        }
                    }
                });
            } else {
                tVar7.h(null);
            }
            t tVar8 = new t(fVar, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.getId", getCodec(), null);
            if (varioqubPigeon != null) {
                final int i11 = 11;
                tVar8.h(new b(varioqubPigeon) { // from class: com.yandex.varioqub.flutter.pigeon.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.VarioqubPigeon f5472b;

                    {
                        this.f5472b = varioqubPigeon;
                    }

                    @Override // H2.b
                    public final void c(Object obj, B0.t tVar22) {
                        switch (i11) {
                            case 0:
                                Pigeon.VarioqubPigeon.lambda$setup$0(this.f5472b, obj, tVar22);
                                break;
                            case 1:
                                Pigeon.VarioqubPigeon.lambda$setup$8(this.f5472b, obj, tVar22);
                                break;
                            case 2:
                                Pigeon.VarioqubPigeon.lambda$setup$9(this.f5472b, obj, tVar22);
                                break;
                            case 3:
                                Pigeon.VarioqubPigeon.lambda$setup$10(this.f5472b, obj, tVar22);
                                break;
                            case 4:
                                Pigeon.VarioqubPigeon.lambda$setup$11(this.f5472b, obj, tVar22);
                                break;
                            case 5:
                                Pigeon.VarioqubPigeon.lambda$setup$1(this.f5472b, obj, tVar22);
                                break;
                            case 6:
                                Pigeon.VarioqubPigeon.lambda$setup$2(this.f5472b, obj, tVar22);
                                break;
                            case 7:
                                Pigeon.VarioqubPigeon.lambda$setup$3(this.f5472b, obj, tVar22);
                                break;
                            case 8:
                                Pigeon.VarioqubPigeon.lambda$setup$4(this.f5472b, obj, tVar22);
                                break;
                            case 9:
                                Pigeon.VarioqubPigeon.lambda$setup$5(this.f5472b, obj, tVar22);
                                break;
                            case 10:
                                Pigeon.VarioqubPigeon.lambda$setup$6(this.f5472b, obj, tVar22);
                                break;
                            default:
                                Pigeon.VarioqubPigeon.lambda$setup$7(this.f5472b, obj, tVar22);
                                break;
                        }
                    }
                });
            } else {
                tVar8.h(null);
            }
            t tVar9 = new t(fVar, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.putClientFeature", getCodec(), null);
            if (varioqubPigeon != null) {
                final int i12 = 1;
                tVar9.h(new b(varioqubPigeon) { // from class: com.yandex.varioqub.flutter.pigeon.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.VarioqubPigeon f5472b;

                    {
                        this.f5472b = varioqubPigeon;
                    }

                    @Override // H2.b
                    public final void c(Object obj, B0.t tVar22) {
                        switch (i12) {
                            case 0:
                                Pigeon.VarioqubPigeon.lambda$setup$0(this.f5472b, obj, tVar22);
                                break;
                            case 1:
                                Pigeon.VarioqubPigeon.lambda$setup$8(this.f5472b, obj, tVar22);
                                break;
                            case 2:
                                Pigeon.VarioqubPigeon.lambda$setup$9(this.f5472b, obj, tVar22);
                                break;
                            case 3:
                                Pigeon.VarioqubPigeon.lambda$setup$10(this.f5472b, obj, tVar22);
                                break;
                            case 4:
                                Pigeon.VarioqubPigeon.lambda$setup$11(this.f5472b, obj, tVar22);
                                break;
                            case 5:
                                Pigeon.VarioqubPigeon.lambda$setup$1(this.f5472b, obj, tVar22);
                                break;
                            case 6:
                                Pigeon.VarioqubPigeon.lambda$setup$2(this.f5472b, obj, tVar22);
                                break;
                            case 7:
                                Pigeon.VarioqubPigeon.lambda$setup$3(this.f5472b, obj, tVar22);
                                break;
                            case 8:
                                Pigeon.VarioqubPigeon.lambda$setup$4(this.f5472b, obj, tVar22);
                                break;
                            case 9:
                                Pigeon.VarioqubPigeon.lambda$setup$5(this.f5472b, obj, tVar22);
                                break;
                            case 10:
                                Pigeon.VarioqubPigeon.lambda$setup$6(this.f5472b, obj, tVar22);
                                break;
                            default:
                                Pigeon.VarioqubPigeon.lambda$setup$7(this.f5472b, obj, tVar22);
                                break;
                        }
                    }
                });
            } else {
                tVar9.h(null);
            }
            t tVar10 = new t(fVar, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.clearClientFeatures", getCodec(), null);
            if (varioqubPigeon != null) {
                final int i13 = 2;
                tVar10.h(new b(varioqubPigeon) { // from class: com.yandex.varioqub.flutter.pigeon.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.VarioqubPigeon f5472b;

                    {
                        this.f5472b = varioqubPigeon;
                    }

                    @Override // H2.b
                    public final void c(Object obj, B0.t tVar22) {
                        switch (i13) {
                            case 0:
                                Pigeon.VarioqubPigeon.lambda$setup$0(this.f5472b, obj, tVar22);
                                break;
                            case 1:
                                Pigeon.VarioqubPigeon.lambda$setup$8(this.f5472b, obj, tVar22);
                                break;
                            case 2:
                                Pigeon.VarioqubPigeon.lambda$setup$9(this.f5472b, obj, tVar22);
                                break;
                            case 3:
                                Pigeon.VarioqubPigeon.lambda$setup$10(this.f5472b, obj, tVar22);
                                break;
                            case 4:
                                Pigeon.VarioqubPigeon.lambda$setup$11(this.f5472b, obj, tVar22);
                                break;
                            case 5:
                                Pigeon.VarioqubPigeon.lambda$setup$1(this.f5472b, obj, tVar22);
                                break;
                            case 6:
                                Pigeon.VarioqubPigeon.lambda$setup$2(this.f5472b, obj, tVar22);
                                break;
                            case 7:
                                Pigeon.VarioqubPigeon.lambda$setup$3(this.f5472b, obj, tVar22);
                                break;
                            case 8:
                                Pigeon.VarioqubPigeon.lambda$setup$4(this.f5472b, obj, tVar22);
                                break;
                            case 9:
                                Pigeon.VarioqubPigeon.lambda$setup$5(this.f5472b, obj, tVar22);
                                break;
                            case 10:
                                Pigeon.VarioqubPigeon.lambda$setup$6(this.f5472b, obj, tVar22);
                                break;
                            default:
                                Pigeon.VarioqubPigeon.lambda$setup$7(this.f5472b, obj, tVar22);
                                break;
                        }
                    }
                });
            } else {
                tVar10.h(null);
            }
            t tVar11 = new t(fVar, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.getAllKeys", getCodec(), null);
            if (varioqubPigeon != null) {
                final int i14 = 3;
                tVar11.h(new b(varioqubPigeon) { // from class: com.yandex.varioqub.flutter.pigeon.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.VarioqubPigeon f5472b;

                    {
                        this.f5472b = varioqubPigeon;
                    }

                    @Override // H2.b
                    public final void c(Object obj, B0.t tVar22) {
                        switch (i14) {
                            case 0:
                                Pigeon.VarioqubPigeon.lambda$setup$0(this.f5472b, obj, tVar22);
                                break;
                            case 1:
                                Pigeon.VarioqubPigeon.lambda$setup$8(this.f5472b, obj, tVar22);
                                break;
                            case 2:
                                Pigeon.VarioqubPigeon.lambda$setup$9(this.f5472b, obj, tVar22);
                                break;
                            case 3:
                                Pigeon.VarioqubPigeon.lambda$setup$10(this.f5472b, obj, tVar22);
                                break;
                            case 4:
                                Pigeon.VarioqubPigeon.lambda$setup$11(this.f5472b, obj, tVar22);
                                break;
                            case 5:
                                Pigeon.VarioqubPigeon.lambda$setup$1(this.f5472b, obj, tVar22);
                                break;
                            case 6:
                                Pigeon.VarioqubPigeon.lambda$setup$2(this.f5472b, obj, tVar22);
                                break;
                            case 7:
                                Pigeon.VarioqubPigeon.lambda$setup$3(this.f5472b, obj, tVar22);
                                break;
                            case 8:
                                Pigeon.VarioqubPigeon.lambda$setup$4(this.f5472b, obj, tVar22);
                                break;
                            case 9:
                                Pigeon.VarioqubPigeon.lambda$setup$5(this.f5472b, obj, tVar22);
                                break;
                            case 10:
                                Pigeon.VarioqubPigeon.lambda$setup$6(this.f5472b, obj, tVar22);
                                break;
                            default:
                                Pigeon.VarioqubPigeon.lambda$setup$7(this.f5472b, obj, tVar22);
                                break;
                        }
                    }
                });
            } else {
                tVar11.h(null);
            }
            t tVar12 = new t(fVar, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.setDefaults", getCodec(), null);
            if (varioqubPigeon == null) {
                tVar12.h(null);
            } else {
                final int i15 = 4;
                tVar12.h(new b(varioqubPigeon) { // from class: com.yandex.varioqub.flutter.pigeon.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.VarioqubPigeon f5472b;

                    {
                        this.f5472b = varioqubPigeon;
                    }

                    @Override // H2.b
                    public final void c(Object obj, B0.t tVar22) {
                        switch (i15) {
                            case 0:
                                Pigeon.VarioqubPigeon.lambda$setup$0(this.f5472b, obj, tVar22);
                                break;
                            case 1:
                                Pigeon.VarioqubPigeon.lambda$setup$8(this.f5472b, obj, tVar22);
                                break;
                            case 2:
                                Pigeon.VarioqubPigeon.lambda$setup$9(this.f5472b, obj, tVar22);
                                break;
                            case 3:
                                Pigeon.VarioqubPigeon.lambda$setup$10(this.f5472b, obj, tVar22);
                                break;
                            case 4:
                                Pigeon.VarioqubPigeon.lambda$setup$11(this.f5472b, obj, tVar22);
                                break;
                            case 5:
                                Pigeon.VarioqubPigeon.lambda$setup$1(this.f5472b, obj, tVar22);
                                break;
                            case 6:
                                Pigeon.VarioqubPigeon.lambda$setup$2(this.f5472b, obj, tVar22);
                                break;
                            case 7:
                                Pigeon.VarioqubPigeon.lambda$setup$3(this.f5472b, obj, tVar22);
                                break;
                            case 8:
                                Pigeon.VarioqubPigeon.lambda$setup$4(this.f5472b, obj, tVar22);
                                break;
                            case 9:
                                Pigeon.VarioqubPigeon.lambda$setup$5(this.f5472b, obj, tVar22);
                                break;
                            case 10:
                                Pigeon.VarioqubPigeon.lambda$setup$6(this.f5472b, obj, tVar22);
                                break;
                            default:
                                Pigeon.VarioqubPigeon.lambda$setup$7(this.f5472b, obj, tVar22);
                                break;
                        }
                    }
                });
            }
        }

        void activateConfig();

        void clearClientFeatures();

        void fetchConfig(Result<FetchStatus> result);

        List<String> getAllKeys();

        Boolean getBoolean(String str, Boolean bool);

        Double getDouble(String str, Double d6);

        String getId();

        Long getInt(String str, Long l2);

        String getString(String str, String str2);

        void initVarioqubWithAppMetricaAdapter(VarioqubSettingsPigeon varioqubSettingsPigeon);

        void putClientFeature(String str, String str2);

        void setDefaults(Map<String, String> map);
    }

    public static class VarioqubPigeonCodec extends r {
        public static final VarioqubPigeonCodec INSTANCE = new VarioqubPigeonCodec();

        private VarioqubPigeonCodec() {
        }

        @Override // H2.r
        public Object readValueOfType(byte b6, ByteBuffer byteBuffer) {
            return b6 != Byte.MIN_VALUE ? b6 != -127 ? super.readValueOfType(b6, byteBuffer) : VarioqubSettingsPigeon.fromList((ArrayList) readValue(byteBuffer)) : FetchStatus.fromList((ArrayList) readValue(byteBuffer));
        }

        @Override // H2.r
        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof FetchStatus) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((FetchStatus) obj).toList());
            } else if (!(obj instanceof VarioqubSettingsPigeon)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((VarioqubSettingsPigeon) obj).toList());
            }
        }
    }

    public static final class VarioqubSettingsPigeon {
        private Boolean activateEvent;
        private Map<String, String> clientFeatures;
        private String clientId;
        private Long fetchThrottleIntervalSeconds;
        private Boolean logs;
        private String url;

        public static final class Builder {
            private Boolean activateEvent;
            private Map<String, String> clientFeatures;
            private String clientId;
            private Long fetchThrottleIntervalSeconds;
            private Boolean logs;
            private String url;

            public VarioqubSettingsPigeon build() {
                VarioqubSettingsPigeon varioqubSettingsPigeon = new VarioqubSettingsPigeon();
                varioqubSettingsPigeon.setClientId(this.clientId);
                varioqubSettingsPigeon.setUrl(this.url);
                varioqubSettingsPigeon.setFetchThrottleIntervalSeconds(this.fetchThrottleIntervalSeconds);
                varioqubSettingsPigeon.setClientFeatures(this.clientFeatures);
                varioqubSettingsPigeon.setLogs(this.logs);
                varioqubSettingsPigeon.setActivateEvent(this.activateEvent);
                return varioqubSettingsPigeon;
            }

            public Builder setActivateEvent(Boolean bool) {
                this.activateEvent = bool;
                return this;
            }

            public Builder setClientFeatures(Map<String, String> map) {
                this.clientFeatures = map;
                return this;
            }

            public Builder setClientId(String str) {
                this.clientId = str;
                return this;
            }

            public Builder setFetchThrottleIntervalSeconds(Long l2) {
                this.fetchThrottleIntervalSeconds = l2;
                return this;
            }

            public Builder setLogs(Boolean bool) {
                this.logs = bool;
                return this;
            }

            public Builder setUrl(String str) {
                this.url = str;
                return this;
            }
        }

        public static VarioqubSettingsPigeon fromList(ArrayList<Object> arrayList) {
            Long valueOf;
            VarioqubSettingsPigeon varioqubSettingsPigeon = new VarioqubSettingsPigeon();
            varioqubSettingsPigeon.setClientId((String) arrayList.get(0));
            varioqubSettingsPigeon.setUrl((String) arrayList.get(1));
            Object obj = arrayList.get(2);
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            varioqubSettingsPigeon.setFetchThrottleIntervalSeconds(valueOf);
            varioqubSettingsPigeon.setClientFeatures((Map) arrayList.get(3));
            varioqubSettingsPigeon.setLogs((Boolean) arrayList.get(4));
            varioqubSettingsPigeon.setActivateEvent((Boolean) arrayList.get(5));
            return varioqubSettingsPigeon;
        }

        public Boolean getActivateEvent() {
            return this.activateEvent;
        }

        public Map<String, String> getClientFeatures() {
            return this.clientFeatures;
        }

        public String getClientId() {
            return this.clientId;
        }

        public Long getFetchThrottleIntervalSeconds() {
            return this.fetchThrottleIntervalSeconds;
        }

        public Boolean getLogs() {
            return this.logs;
        }

        public String getUrl() {
            return this.url;
        }

        public void setActivateEvent(Boolean bool) {
            this.activateEvent = bool;
        }

        public void setClientFeatures(Map<String, String> map) {
            this.clientFeatures = map;
        }

        public void setClientId(String str) {
            this.clientId = str;
        }

        public void setFetchThrottleIntervalSeconds(Long l2) {
            this.fetchThrottleIntervalSeconds = l2;
        }

        public void setLogs(Boolean bool) {
            this.logs = bool;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(6);
            arrayList.add(this.clientId);
            arrayList.add(this.url);
            arrayList.add(this.fetchThrottleIntervalSeconds);
            arrayList.add(this.clientFeatures);
            arrayList.add(this.logs);
            arrayList.add(this.activateEvent);
            return arrayList;
        }
    }

    public static ArrayList<Object> wrapError(Throwable th) {
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof FlutterError) {
            FlutterError flutterError = (FlutterError) th;
            arrayList.add(flutterError.code);
            arrayList.add(flutterError.getMessage());
            arrayList.add(flutterError.details);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        }
        return arrayList;
    }
}
