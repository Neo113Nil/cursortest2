package com.withpersona.sdk2.inquiry.selfie;

import android.graphics.Bitmap;
import androidx.credentials.Credential;
import com.withpersona.sdk2.camera.SelfiePhoto$Pose$Center;
import com.withpersona.sdk2.camera.SelfiePhoto$Pose$Left;
import com.withpersona.sdk2.camera.SelfiePhoto$Pose$Right;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Result;

/* loaded from: classes9.dex */
public abstract class SelfieKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Selfie.Pose.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Selfie.Pose pose = Selfie.Pose.Center;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Selfie.Pose pose2 = Selfie.Pose.Center;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[NextStep.Selfie.SelfiePose.values().length];
            try {
                iArr2[NextStep.Selfie.SelfiePose.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[NextStep.Selfie.SelfiePose.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[NextStep.Selfie.SelfiePose.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final String getPathName(Selfie.Pose pose) {
        int ordinal = pose.ordinal();
        if (ordinal == 0) {
            return "center";
        }
        if (ordinal == 1) {
            return "left";
        }
        if (ordinal == 2) {
            return "right";
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final Object saveSelfie(Credential credential, SdkFilesManager sdkFilesManager) {
        credential.getClass();
        sdkFilesManager.getClass();
        Bitmap bitmap = (Bitmap) credential.data;
        try {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                File newRandomSessionFile = sdkFilesManager.newRandomSessionFile("jpg");
                FileOutputStream fileOutputStream = new FileOutputStream(newRandomSessionFile);
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
                    fileOutputStream.close();
                    Result.Companion companion = Result.Companion;
                    String absolutePath = newRandomSessionFile.getAbsolutePath();
                    absolutePath.getClass();
                    Selfie.SelfieImage selfieImage = new Selfie.SelfieImage(absolutePath, Selfie.CaptureMethod.AUTO, to(credential), currentTimeMillis);
                    bitmap.recycle();
                    return selfieImage;
                } finally {
                }
            } catch (IOException e) {
                Result.Companion companion2 = Result.Companion;
                Result.Failure failure = new Result.Failure(e);
                bitmap.recycle();
                return failure;
            }
        } catch (Throwable th) {
            bitmap.recycle();
            throw th;
        }
    }

    public static final Selfie.Pose to(Credential credential) {
        credential.getClass();
        if (credential instanceof SelfiePhoto$Pose$Center) {
            return Selfie.Pose.Center;
        }
        if (credential instanceof SelfiePhoto$Pose$Left) {
            return Selfie.Pose.Left;
        }
        if (credential instanceof SelfiePhoto$Pose$Right) {
            return Selfie.Pose.Right;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }
}
