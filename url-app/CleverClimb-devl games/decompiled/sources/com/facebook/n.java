package com.facebook;

/* compiled from: FacebookServiceException.java */
/* loaded from: classes.dex */
public class n extends j {

    /* renamed from: a, reason: collision with root package name */
    private final FacebookRequestError f6320a;

    public n(FacebookRequestError facebookRequestError, String str) {
        super(str);
        this.f6320a = facebookRequestError;
    }

    public final FacebookRequestError a() {
        return this.f6320a;
    }

    @Override // com.facebook.j, java.lang.Throwable
    public final String toString() {
        return "{FacebookServiceException: httpResponseCode: " + this.f6320a.getRequestStatusCode() + ", facebookErrorCode: " + this.f6320a.getErrorCode() + ", facebookErrorType: " + this.f6320a.getErrorType() + ", message: " + this.f6320a.getErrorMessage() + "}";
    }
}
