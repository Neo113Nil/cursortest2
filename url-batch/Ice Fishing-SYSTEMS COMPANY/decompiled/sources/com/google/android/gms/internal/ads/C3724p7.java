package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.p7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3724p7 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: u, reason: collision with root package name */
    public final Application f33332u;

    /* renamed from: v, reason: collision with root package name */
    public final WeakReference f33333v;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f33331n = 0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f33334w = false;

    public C3724p7(Application application, B7 b72) {
        this.f33333v = new WeakReference(b72);
        this.f33332u = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Application application = this.f33332u;
        WeakReference weakReference = this.f33333v;
        switch (this.f33331n) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityCreated(activity, bundle);
                    } else if (!this.f33334w) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f33334w = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityCreated(activity, bundle);
                    } else if (!this.f33334w) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f33334w = true;
                    }
                    break;
                } catch (Exception e6) {
                    int i = t2.C.f40822b;
                    u2.i.d("Error while dispatching lifecycle callback.", e6);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Application application = this.f33332u;
        WeakReference weakReference = this.f33333v;
        switch (this.f33331n) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityDestroyed(activity);
                    } else if (!this.f33334w) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f33334w = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityDestroyed(activity);
                    } else if (!this.f33334w) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f33334w = true;
                    }
                    break;
                } catch (Exception e6) {
                    int i = t2.C.f40822b;
                    u2.i.d("Error while dispatching lifecycle callback.", e6);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Application application = this.f33332u;
        WeakReference weakReference = this.f33333v;
        switch (this.f33331n) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityPaused(activity);
                    } else if (!this.f33334w) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f33334w = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityPaused(activity);
                    } else if (!this.f33334w) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f33334w = true;
                    }
                    break;
                } catch (Exception e6) {
                    int i = t2.C.f40822b;
                    u2.i.d("Error while dispatching lifecycle callback.", e6);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Application application = this.f33332u;
        WeakReference weakReference = this.f33333v;
        switch (this.f33331n) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityResumed(activity);
                    } else if (!this.f33334w) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f33334w = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityResumed(activity);
                    } else if (!this.f33334w) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f33334w = true;
                    }
                    break;
                } catch (Exception e6) {
                    int i = t2.C.f40822b;
                    u2.i.d("Error while dispatching lifecycle callback.", e6);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Application application = this.f33332u;
        WeakReference weakReference = this.f33333v;
        switch (this.f33331n) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivitySaveInstanceState(activity, bundle);
                    } else if (!this.f33334w) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f33334w = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivitySaveInstanceState(activity, bundle);
                    } else if (!this.f33334w) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f33334w = true;
                    }
                    break;
                } catch (Exception e6) {
                    int i = t2.C.f40822b;
                    u2.i.d("Error while dispatching lifecycle callback.", e6);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Application application = this.f33332u;
        WeakReference weakReference = this.f33333v;
        switch (this.f33331n) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityStarted(activity);
                    } else if (!this.f33334w) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f33334w = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityStarted(activity);
                    } else if (!this.f33334w) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f33334w = true;
                    }
                    break;
                } catch (Exception e6) {
                    int i = t2.C.f40822b;
                    u2.i.d("Error while dispatching lifecycle callback.", e6);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Application application = this.f33332u;
        WeakReference weakReference = this.f33333v;
        switch (this.f33331n) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityStopped(activity);
                    } else if (!this.f33334w) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f33334w = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityStopped(activity);
                    } else if (!this.f33334w) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f33334w = true;
                    }
                    break;
                } catch (Exception e6) {
                    int i = t2.C.f40822b;
                    u2.i.d("Error while dispatching lifecycle callback.", e6);
                    return;
                }
        }
    }

    public C3724p7(Application application, ViewOnAttachStateChangeListenerC3779q8 viewOnAttachStateChangeListenerC3779q8) {
        this.f33333v = new WeakReference(viewOnAttachStateChangeListenerC3779q8);
        this.f33332u = application;
    }
}
