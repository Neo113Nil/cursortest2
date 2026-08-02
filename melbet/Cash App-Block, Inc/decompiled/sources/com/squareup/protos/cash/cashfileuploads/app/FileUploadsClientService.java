package com.squareup.protos.cash.cashfileuploads.app;

import app.cash.api.ApiResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\b\u001a\u00020\tH§@¢\u0006\u0002\u0010\nJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\r\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/cashfileuploads/app/FileUploadsClientService;", "", "uploadFile", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/cashfileuploads/app/UploadFileResponse;", "filename", "", "uploadContext", "body", "Lokhttp3/RequestBody;", "(Ljava/lang/String;Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFile", "Lcom/squareup/protos/cash/cashfileuploads/app/DeleteFileResponse;", "request", "Lcom/squareup/protos/cash/cashfileuploads/app/DeleteFileRequest;", "(Lcom/squareup/protos/cash/cashfileuploads/app/DeleteFileRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface FileUploadsClientService {
    @POST("/cash-app/file-uploads/delete-file")
    Object deleteFile(@Body DeleteFileRequest deleteFileRequest, Continuation<? super ApiResult<DeleteFileResponse>> continuation);

    @Headers({"Content-Encoding: identity"})
    @POST("/cash-app/file-uploads/upload-file")
    Object uploadFile(@Header("X-File-Name") String str, @Header("X-Upload-Context") String str2, @Body RequestBody requestBody, Continuation<? super ApiResult<UploadFileResponse>> continuation);
}
